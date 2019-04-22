/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public class PassportForThirdAdapter extends SignService implements IPassportForThird{
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    public ResultMsg loginForSina(String id) {
        return processLogin(id,LoginForSinaAdapter.class);
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }else{
                return null;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
