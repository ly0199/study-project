package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:21
 * @description
 */
public class LoginState {

    private int code;
    private Object data;
    private String msg;

    public LoginState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "LoginState{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
