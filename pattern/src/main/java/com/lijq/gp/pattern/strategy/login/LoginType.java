package com.lijq.gp.pattern.strategy.login;

/**
 * @author Lijq
 * @date 2018/3/12 10:33
 * @description
 */
public enum LoginType {

    QQ(new QQLogin()),
    WeiChat(new WeiChatLogin());

    private ILogin login;

    LoginType(ILogin login) {
        this.login = login;
    }

    public ILogin get() {
        return login;
    }
}
