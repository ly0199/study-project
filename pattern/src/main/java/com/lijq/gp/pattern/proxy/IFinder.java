package com.lijq.gp.pattern.proxy;

import com.lijq.gp.pattern.proxy.statics.House;

import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/10 23:46
 * @description
 */
public interface IFinder {

    /**
     * 找房子
     */
    public List<House> findHouse();

    /**
     * 找工作
     */
    public void findWork();

    /**
     * 买东西
     */
    public void buy();

}
