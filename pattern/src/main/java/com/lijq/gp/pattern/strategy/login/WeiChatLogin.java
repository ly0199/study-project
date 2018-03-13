package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:29
 * @description
 */
public class WeiChatLogin implements ILogin {
    @Override
    public LoginState login(String username, String password) {
        return new LoginState(200, WeiChatLogin.class.getName(), "Login Success");
    }
}
