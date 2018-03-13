package com.lijq.gp.pattern.template;

import java.sql.ResultSet;

/**
 * @author Lijq
 * @date 2018/3/12 10:43
 * @description
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet rs, int rowNum) throws Exception;
}
