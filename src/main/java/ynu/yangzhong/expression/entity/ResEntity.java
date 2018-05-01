package ynu.yangzhong.expression.entity;

import ynu.yangzhong.expression.statuscode.ResCode;

public class ResEntity {
    private int code;
    private String msg;
    private Object data;

    public ResEntity (ResCode resCode){
        this.code=resCode.getCode();
        this.msg=resCode.getMsg();

    }

    public ResEntity(ResCode resCode,Object data){
        this(resCode);
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
