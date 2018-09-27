package com;

public class OpFactory {
    public static Operation createOperation(String opstr){
        if(opstr.equalsIgnoreCase("+"))
            return new OpAdd();
        else if(opstr.equalsIgnoreCase("-"))
            return new OpSub();
        else if(opstr.equalsIgnoreCase("*"))
            return new OpMul();
        else
            return new OpDiv();
    }
}
