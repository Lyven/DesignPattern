/**
 * @Author: wensp
 * @Version: v1.0 2019-4-26
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +" + 一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+ 2;
    }
}
