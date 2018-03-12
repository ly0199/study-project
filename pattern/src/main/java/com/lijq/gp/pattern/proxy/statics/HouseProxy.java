package com.lijq.gp.pattern.proxy.statics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lijq
 * @date 2018/3/10 23:01
 * @description
 */
public class HouseProxy {

    public List<House> findHouse(People people) {

        List<House> houses = new ArrayList<>();

        House house = new House();
        house.setArea(10);
        house.setPrice(BigDecimal.valueOf(800));
        houses.add(house);

        house = new House();
        house.setArea(20);
        house.setPrice(BigDecimal.valueOf(1400));
        houses.add(house);

        house = new House();
        house.setArea(30);
        house.setPrice(BigDecimal.valueOf(2000));
        houses.add(house);

        return houses.stream()
                .filter(h ->
                        (h.getPrice().compareTo(people.getMaxPrice()) >= 0
                                && h.getPrice().compareTo(people.getMaxPrice()) <= 0))
                .filter(h -> (h.getArea() >= people.getMinArea() && h.getArea() <= people.getMaxArea()))
                .collect(Collectors.toList());


    }


}
