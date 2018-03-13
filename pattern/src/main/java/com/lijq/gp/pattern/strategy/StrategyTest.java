package com.lijq.gp.pattern.strategy;

import com.lijq.gp.pattern.strategy.login.Login;
import com.lijq.gp.pattern.strategy.login.LoginState;
import com.lijq.gp.pattern.strategy.login.LoginType;
import org.junit.Test;

/**
 * @author Lijq
 * @date 2018/3/12 10:19
 * @description
 */
public class StrategyTest {


    @Test
    public void loginTest() {

        Login login = new Login("Lijq", "jiushipassword");

        LoginState state = login.login(LoginType.QQ);
        System.out.println(state);

        state = login.login(LoginType.WeiChat);
        System.out.println(state);

    }

}
