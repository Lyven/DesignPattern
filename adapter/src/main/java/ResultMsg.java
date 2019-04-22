/**
 * @Author: wensp
 * @Version: v1.0 2019-4-23
 */
public class ResultMsg {
    public String code;
    public String msg;
    public Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultMsg(String code,String msg,Object obj){
        this.code = code;
        this.msg = msg;
        this.data = obj;
    }
}
