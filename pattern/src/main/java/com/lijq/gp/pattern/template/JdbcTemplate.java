package com.lijq.gp.pattern.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijq
 * @date 2018/3/12 10:44
 * @description
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Object> result = new ArrayList<>();

        try {
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i, values[i]);
            }
            rs = pstmt.executeQuery();

            int rowNum = 1;
            while (rs.next()) {
                result.add(rowMapper.mapRow(rs, rowNum++));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (null != pstmt) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (null != conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
