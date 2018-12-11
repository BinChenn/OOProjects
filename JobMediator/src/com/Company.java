package com;

import java.util.ArrayList;

public class Company extends Colleague {
    private String name;
    private int salary;
    private int jobtype;
    private String jobaddress;
    private int exability;

    public Company(Mediator mediator, String name, int salary, int jobtype, String jobaddress, int exability) {
        super(mediator);
        this.name = name;
        this.salary = salary;
        this.jobaddress = jobaddress;
        this.jobtype = jobtype;
        this.exability = exability;
    }

    public boolean decide(JobFinder finders){
        if( (finders instanceof JobFinder)
            && (finders.getAbility() >= this.exability ) )
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobtype() {
        return jobtype;
    }

    public void setJobtype(int jobtype) {
        this.jobtype = jobtype;
    }

    public String getJobaddress() {
        return jobaddress;
    }

    public void setJobaddress(String jobaddress) {
        this.jobaddress = jobaddress;
    }
}
