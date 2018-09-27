package com;

public abstract class Operation {
    private Double num1;
    private Double num2;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public abstract Double getResult() throws Exception;
}

class OpAdd extends Operation{
    @Override
    public Double getResult() throws Exception {
        return getNum1()+getNum2();
    }
}

class OpSub extends Operation{
    @Override
    public Double getResult() throws Exception {
        return getNum1()-getNum2();
    }
}

class OpMul extends Operation{
    @Override
    public Double getResult() throws Exception {
        return getNum1()* getNum2();
    }
}

class OpDiv extends Operation{
    @Override
    public Double getResult() throws Exception {
        if(getNum2() != 0)
        return getNum1()/getNum2();
        else
            return Double.MIN_VALUE;
    }
}
