package com;

import java.sql.*;

public class RealSqlOp implements SqlOp{

    @Override
    public int count(String userId, String item) {
        try{
            Connection conn = DBUtil.getConnection(userId);
            PreparedStatement stat = conn.prepareStatement("select COUNT("+item+") from table1");
            stat.execute();
            ResultSet rs = stat.getResultSet();
            if(rs.next())
                return rs.getInt(1);
            //DBUtil.closeAll(rs, stat,conn);
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return -1;
    }

    @Override
    public Boolean insert(String userId, String name, String data) {
        try{
            Connection conn = DBUtil.getConnection(userId);
            PreparedStatement stat = conn.prepareStatement("insert into table1 " +
                    name + " values " + data );
            stat.execute();
            //ResultSet rs = stat.getResultSet();
            //DBUtil.closeAll(rs, stat,conn);
            return true;
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return false;

    }

    @Override
    public String query(String userId, String name , String condition) {
        try{
            Connection conn = DBUtil.getConnection(userId);
            System.out.println(condition);
            if(condition.trim().length()!=0){
                condition=" where "+condition;
            }
            PreparedStatement state = conn.prepareStatement("select " +
                    name +" from table1 "+ condition );
            state.execute();
            ResultSet rs = state.getResultSet();
            String result = "";
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnnum = rsmd.getColumnCount();
            while((rs!=null) && (rs.next()))
            {
                for(int i=1; i<= columnnum;i++)
                    result += rs.getString(i)+", ";
                result+="\n";
            }
            //DBUtil.closeAll(rs, state,conn);
            return result;
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return null;

    }

    @Override
    public Boolean delete(String userId, String item) {
        try{
            Connection conn = DBUtil.getConnection(userId);
            PreparedStatement state = conn.prepareStatement("delete from table1 where "+item);
            state.execute();
            ResultSet rs = state.getResultSet();
            //DBUtil.closeAll(rs, state,conn);
            return true;
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(String userId, String item, String condition) {
        try{
            Connection conn = DBUtil.getConnection(userId);
            PreparedStatement state = conn.prepareStatement("update table1 set " +
                    item + " where " + condition);
            state.execute();
            ResultSet rs = state.getResultSet();
            //DBUtil.closeAll(rs, state,conn);
            return true;
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        return false;

    }
}
