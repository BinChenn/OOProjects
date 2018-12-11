package com;

public class Job {
    private int salary;
    private int jobtype;
    private String jobaddress;

    public Job(int salary, int jobtype, String jobaddress) {
        this.salary = salary;
        this.jobtype = jobtype;
        this.jobaddress = jobaddress;
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
