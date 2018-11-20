package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            SqlOpProxy op = new SqlOpProxy();
            while(!op.userLogin())
                System.out.println("Wrong userId/password, plese try again!");
            System.out.println("User Login success");

            String command, none="";
            System.out.println("input command:");
            while((command = new BufferedReader(new InputStreamReader(System.in)).readLine())!=null){
                if(command.equals("count")){
                    System.out.println(op.count(none, none));
                }
                else if(command.equals("insert")){
                    if(op.insert(none, none, none))
                        System.out.println("Insert success");
                    else
                        System.out.println("Insert fail");
                }
                else if(command.equals("delete")){
                    if(op.delete(none, none))
                        System.out.println("Delete success");
                    else
                        System.out.println("Delete fail");
                }
                else if(command.equals("query")){
                    String result = op.query(none, none, none);
                    if(result!=null)
                        System.out.println(result);
                    else
                        System.out.println("Query Fail");
                }
                else if(command.equals("update")) {
                    if (op.update(none, none, none))
                        System.out.println("Update success");
                    else
                        System.out.println("Update fail");
                }
                else if(command.equals("exit"))
                    break;
                else
                    System.out.println("Command don't exist!");
                System.out.println("input command:");
            }

        }
        catch (Exception ioex){
            ioex.printStackTrace();
        }

	// write your code here
    }
}
