package com;

public class Main {

    public static void main(String[] args) {
	    JobMediator me = new JobMediator();
	    Company tsinghua = new Company(me, "tsinghua", 10000, 1, "beijing", 100);
	    JobFinder finder = new JobFinder(me, "tom", 10000, 1, "beijing", 100);
	    me.RegisterJob(tsinghua);
	    me.RegisterFinder(finder);
	    finder.findjob();
	    Company pku = new Company(me, "pku", 11000, 1, "beijing", 100);
	    Company hit = new Company(me, "hit", 11000, 2, "Harbin", 100);
	    me.RegisterJob(pku);
	    me.RegisterJob(hit);
    }
}
