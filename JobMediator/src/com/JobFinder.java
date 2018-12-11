package com;

import java.util.ArrayList;
import java.util.Iterator;

public class JobFinder extends Colleague {
    private String name;
    private int expectedSalary;
    private int expectedJob;
    private String expectedAddress;
    private int ability;

    public JobFinder(Mediator mediator, String name, int exslalry, int exjob, String exAddr, int ability) {
        super(mediator);
        this.name = name;
        this.expectedJob = exjob;
        this.expectedAddress = exAddr;
        this.expectedSalary = exslalry;
        this.ability = ability;
    }

    public void findjob(){
        ArrayList<Company> list = ((JobMediator)this.getMediator()).getJoblist();
        for (int i = 0; i< list.size(); i++){
            if( ((list.get(i).getSalary()) >= this.expectedSalary)
            && ((list.get(i).getJobaddress()) == this.expectedAddress)
            && ( (list.get(i).getJobtype())  == this.expectedJob ))
                this.getMediator().apply(this, list.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public int getExpectedJob() {
        return expectedJob;
    }

    public void setExpectedJob(int expectedJob) {
        this.expectedJob = expectedJob;
    }

    public String getExpectedAddress() {
        return expectedAddress;
    }

    public void setExpectedAddress(String expectedAddress) {
        this.expectedAddress = expectedAddress;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }
}
