package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:36
 * @description
 */
public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginState login(LoginType loginType) {
        return loginType.get().login(this.username, this.password);
    }
}
