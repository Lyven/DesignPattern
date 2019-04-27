/**
 * @Author: wensp
 * @Version: v1.0 2019-4-26
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + " 总价：" + battercake.getPrice());
    }
}
