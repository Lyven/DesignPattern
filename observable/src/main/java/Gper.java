import java.util.Observable;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-27
 */
public class Gper extends Observable {
    public String fdName = "GP";
    private Gper(){}

    private static Gper gper = null;
    public static Gper getInstance(){
        if(null == gper){
            gper = new Gper();
        }
        return gper;
    }

    public String getFdName(){
        return this.fdName;
    }

    public void publishQuestion(Question question){
        setChanged();
        notifyObservers(question);
    }
}
