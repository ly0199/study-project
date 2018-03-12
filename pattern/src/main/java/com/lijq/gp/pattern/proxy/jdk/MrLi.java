package com.lijq.gp.pattern.proxy.jdk;

import com.lijq.gp.pattern.proxy.IFinder;
import com.lijq.gp.pattern.proxy.statics.House;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/10 23:49
 * @description
 */
public class MrLi implements IFinder {

    private static Logger logger = LoggerFactory.getLogger(MrLi.class);

    @Override
    public List<House> findHouse() {
        logger.info("Mr.Li begin find house");
        return null;
    }

    @Override
    public void findWork() {

    }

    @Override
    public void buy() {

    }
}
