package com;

public class AccessValidator {
    public boolean userValidator(String userId, String password){
        if(userId.equals("admin") && password.equals("123456")){
            return true;
        }else{
            return false;
        }
    }

}
