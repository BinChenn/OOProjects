package com;
import java.sql.*;

public class DBUtil {
    private static Connection conn = null;

    public static Connection getConnection(String userId) {
        if (conn == null) {
            try {
                Class.forName("com.hxtt.sql.access.AccessDriver");
                conn = DriverManager.getConnection("jdbc:access:///Database1.accdb", userId, "");
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
