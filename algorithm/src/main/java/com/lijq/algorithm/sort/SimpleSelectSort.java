package com.lijq.algorithm.sort;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @author Lijq
 * @date 2018/3/9 15:29
 * @description 简单选择排序
 */
public class SimpleSelectSort {

    @Test
    public void SelectSort() {
        int[] array = {12, 23, 9, 24, 15, 3, 18};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < i; j++) {
                if (array[j] < array[i]) {
                    int index = array[i];
                    array[i] = array[j];
                    array[j] = index;
                }
            }
            System.out.println(JSON.toJSONString(array));
        }
    }
}
