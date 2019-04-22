/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public class SignService {
    public ResultMsg registerUser(String userName,String password){
        return new ResultMsg("200","register sucess!",new Member(userName,password));
    }

    public ResultMsg loginIn(String userName,String password){
        return new ResultMsg("300","login in sucess",new Member(userName,password));
    }
}
