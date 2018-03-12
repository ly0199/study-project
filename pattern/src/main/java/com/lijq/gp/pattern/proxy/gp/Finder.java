package com.lijq.gp.pattern.proxy.gp;

/**
 * @author Lijq
 * @date 2018/3/12 9:41
 * @description
 */
public class Finder implements IFinder {
    @Override
    public void findHouse() {
        System.out.println("Finder --> findHouse");
    }

    @Override
    public void findWork() {
        System.out.println("Finder --> findWork");
    }

    @Override
    public void buy() {
        System.out.println("Finder --> buy");
    }
}
