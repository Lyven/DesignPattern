/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public class LoginForSinaAdapter implements LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
