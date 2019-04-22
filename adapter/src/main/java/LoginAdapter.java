/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
