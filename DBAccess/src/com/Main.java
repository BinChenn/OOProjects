package com;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DBUtil.getConnection();
            PreparedStatement state = conn.prepareStatement("select * from 考试成绩 where 学号 = '063027270001'");
            state.execute();
            ResultSet rs = state.getResultSet();
            while((rs!=null) && (rs.next()))
            {
                System.out.println(rs.getString(3) + " : " + rs.getString(2));
            }

            DBUtil.closeAll(rs, state,conn);
        }
        catch (SQLException ioex){
            System.out.println("ioex");
        }


	// write your code here
    }
}
