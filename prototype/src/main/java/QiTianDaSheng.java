import java.io.*;
import java.util.Date;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-24
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;
    public QiTianDaSheng(){
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public QiTianDaSheng deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng qts = (QiTianDaSheng)ois.readObject();
            qts.birthday = new Date();
            return qts;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
