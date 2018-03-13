package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:20
 * @description
 */
public interface ILogin {

    public LoginState login(String username, String password);
}
