package com.gupao.designPattern.proxy.dynamicProxy.gpProxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-25
 */
public class GPProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstance(GPClassLoader classLoader, Class<?>[] interfaces, final GPInvocationHandler h) throws IllegalArgumentException {
        try{
            //1、生成java代码
            String src = generateSrc(interfaces);

            //2、java文件输出到磁盘
            String path = GPProxy.class.getResource("").getPath();
            File file = new File(path +"$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、动态编译，把生成的.java文件编译成.class文件
            JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = jc.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = jc.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();

            //4、编译生成的.class文件加载到JVM中来
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            file.delete();

            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        //生成java源代码
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.designPattern.proxy.dynamicProxy.gpProxy;" + ln);
        sb.append("import com.gupao.designPattern.proxy.IPerson;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);

        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        //申明一个变量
        sb.append("GPInvocationHandler h;" + ln);
        //构造方法
        sb.append("public $Proxy0(GPInvocationHandler h){" +ln);
            sb.append("this.h = h;"+ln);
        sb.append("}"+ln);

        //方法重写
        for(Method m :interfaces[0].getMethods()){
            sb.append("public "+m.getReturnType().getName() +" " + m.getName() + "(){" +ln);
                sb.append("try{"+ln);
                    sb.append("Method m = " + interfaces[0].getName() +".class.getMethod(\""+ m.getName() +"\",new Class[]{});" + ln);
                    sb.append("this.h.invoke(this,m,null);"+ln);
                    sb.append("}catch(Throwable e){" + ln);
                    sb.append("e.printStackTrace();"+ln);
                sb.append("}"+ln);
            sb.append("}" + ln);
        }

        sb.append("}" + ln);
        return sb.toString();
    }
}
