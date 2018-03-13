package com.lijq.gp.pattern.template;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/13 13:40
 * @description
 */
public class BookDao {

    private JdbcTemplate JdbcTemplate = new JdbcTemplate(null);

    public List<?> query() {
        String sql = "select * from t_book";
        return JdbcTemplate.executeQuery(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws Exception {
                Book book = new Book();
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getBigDecimal("price"));
                return book;
            }
        }, null);
    }

}
