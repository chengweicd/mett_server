package ynu.yangzhong.expression.statuscode;

public enum ResCode {
    SUCCESS (1,"请求成功"),
    WARN (0,"网络无响应"),
    LOGINSUCCESS(2,"登陆成功"),
    USERNOTEXIST(3,"用户不存在"),
    PASSWORDERRO(4,"密码错误");

    private int code;
    private String msg;

    ResCode(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }



    public String getMsg() {
        return msg;
    }

}
