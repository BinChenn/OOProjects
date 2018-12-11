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

    public void RegisterJob(Company job){
        companylist.add(job);
    }

    public void RegisterFinder(JobFinder finder){
        finders.add(finder);
    }

    public ArrayList<Company> getJoblist(){
        return companylist;
    }
}
