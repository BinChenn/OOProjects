package com;

import java.util.ArrayList;

public class JobMediator implements Mediator {
    private ArrayList<Company> companylist = new ArrayList<Company>();
    private ArrayList<JobFinder> finders = new ArrayList<JobFinder>();


    @Override
    public void apply(Colleague applier, Colleague job) {
        System.out.println(((JobFinder)applier).getName()+" want to apply " + ((Company)job).getName());
        if(((Company)job).decide((JobFinder) applier))
            System.out.println("Accepted");
        else
            System.out.println("Reject");

    }

    @Override
    public void notifyfinders() {
        Company job = companylist.get(companylist.size()-1);
        for (int i = 0; i < finders.size(); i++){
            JobFinder fi = finders.get(i);
            if ((fi.getExpectedSalary() <= job.getSalary())
                    && (fi.getExpectedJob() == job.getJobtype())
                    && (fi.getExpectedAddress() == job.getJobaddress())
            )
                System.out.println("Hey " + fi.getName()+", There is a job: "
                + job.getName()+" suit you!");
        }

    }

    public void RegisterJob(Company job){
        companylist.add(job);
        this.notifyfinders();
    }

    public void RegisterFinder(JobFinder finder){
        finders.add(finder);
    }

    public ArrayList<Company> getJoblist(){
        return companylist;
    }
}
