/**
 * @Author: wensp
 * @Version: v1.0 2019-4-18
 */
public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直接减优惠券抵扣");
    }
}
