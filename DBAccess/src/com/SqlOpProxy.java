package com;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SqlOpProxy implements SqlOp {

    private RealSqlOp sqlop;
    private AccessValidator acval;
    private String userId, password;

    public SqlOpProxy(){
        sqlop = new RealSqlOp();
    }

    public boolean userLogin(){
        try{
            System.out.println("Input userid");
            this.userId = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Input password");
            this.password = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if(checkAccess(userId, password))
                return true;
            else
                return false;
        }
        catch(IOException ioex){
            System.out.println("input userid/password error");
        }
        return false;
    }

    @Override
    public int count(String none, String none1) {
        try{
            if(checkAccess(userId, password)){
                System.out.println("Input column name wanted to count");
                String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
                return sqlop.count(userId, item);
            }
            else
                System.out.println("Permission Denied");


        }
        catch(IOException ioex){
            System.out.println("Data you inputed is wrong");
        }
        return -1;
    }

    @Override
    public Boolean insert(String none, String none1, String data) {
        try{
            if(checkAccess(userId, password)){
                System.out.println("Input column name wanted to insert like(a,b,c), if all column, input 'all'");
                String columnname = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if(columnname.equals("all"))
                    columnname = "(ID, name, gender, politics, chinese, math, english, physics, biography, history, geography)";
                System.out.println("Input corresponding data like(a,b,c)");
                String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
                return sqlop.insert(userId, columnname, item);
            }
            else
                System.out.println("Permission Denied");

        }
        catch(IOException ioex){
            System.out.println("Data you inputed is wrong");
        }

        return null;
    }

    @Override
    public String query(String none, String none1, String condition) {
        try{
            if(checkAccess(userId, password)){
                System.out.println("Input column name wanted to query like ID, name, gender, if all column, input 'all' ");
                String columnname = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if(columnname.equals("all"))
                    columnname = "*";
                System.out.println("Input query condition like gender='female' or chinese=86 ");
                String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
                return sqlop.query(userId, columnname, item);
            }
            else
                System.out.println("Permission Denied");
        }
        catch(IOException ioex){
            System.out.println("Data you inputed is wrong");
        }
        return null;
    }

    @Override
    public Boolean delete(String none, String none1) {
        try{
            if(checkAccess(userId, password)){
                System.out.println("Input delete condition like gender='female' or chinese=86 ");
                String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
                return sqlop.delete(userId, item);
            }
            else
                System.out.println("Permission Denied");
        }
        catch(IOException ioex){
            System.out.println("Data you inputed is wrong");
        }
        return null;
    }

    @Override
    public Boolean update(String none, String none1, String none2) {
        try{
            if(checkAccess(userId, password)){
                System.out.println("Input data you wanted to update, like gender='female' or chinese=86 ");
                String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Input condition like ID=1");
                String condition = new BufferedReader(new InputStreamReader(System.in)).readLine();
                return sqlop.update(userId, item, condition);
            }
            else
                System.out.println("Permission Denied");
        }
        catch(IOException ioex){
            System.out.println("Data you inputed is wrong");
        }
        return null;
    }


    private Boolean checkAccess(String userId, String password){
        AccessValidator acval = new AccessValidator();
        return acval.userValidator(userId, password);
    }
}
