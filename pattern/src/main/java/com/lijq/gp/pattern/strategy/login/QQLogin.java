package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:28
 * @description
 */
public class QQLogin implements ILogin {
    @Override
    public LoginState login(String username, String password) {
        return new LoginState(200, QQLogin.class.getName(), "Login Success");
    }
}
