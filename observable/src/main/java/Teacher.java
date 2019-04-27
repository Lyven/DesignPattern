import java.util.Observable;
import java.util.Observer;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-27
 */
public class Teacher implements Observer {
    public String fdName;
    public Teacher(String fdName){
        this.fdName = fdName;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public void update(Observable observable, Object o) {
        Gper gper = (Gper)observable;
        Question question = (Question)o;
        System.out.println(this.fdName + " 老师，您好！您收到一个来自" +gper.getFdName() +" 的提问:\n");
        System.out.println("提问人:"+question.getUserName() +"\n");
        System.out.println("问题："+question.getFdContent());
    }
}
