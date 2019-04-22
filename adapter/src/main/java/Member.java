/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public class Member {
    public String userName;
    public String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Member(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
}
