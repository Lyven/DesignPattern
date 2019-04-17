/**
 * @Author: wensp
 * @Version: v1.0 2019-4-18
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
