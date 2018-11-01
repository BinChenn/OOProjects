package com;
import java.sql.*;

/**
 * Created by Camille on 2017/11/11.
 * 数据库连接接口
 */
public class DBUtil {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.hxtt.sql.access.AccessDriver");
                conn = DriverManager.getConnection("jdbc:access:///mydb.accdb", "admin", "");
                System.out.println("Connected!");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
