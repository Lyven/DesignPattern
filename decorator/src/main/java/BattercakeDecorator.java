/**
 * @Author: wensp
 * @Version: v1.0 2019-4-26
 */
public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {

        return battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return battercake.getPrice();
    }
}
