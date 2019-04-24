import java.io.Serializable;

/**
 * @Author: wensp
 * @Version: v1.0 2019-4-24
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float w = 10;

    public void big(){
        this.h *= 2;
        this.w *= 2;
    }

    public void small(){
        this.h /= 2;
        this.w /= 2;
    }
}
