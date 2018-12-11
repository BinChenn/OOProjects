package com;

public class Main {

    public static void main(String[] args) {
	    JobMediator me = new JobMediator();
	    Company com = new Company(me, "tsinghua", 10000, 1, "beijing", 100);
	    JobFinder finder = new JobFinder(me, "tom", 10000, 1, "beijing", 100);
	    me.RegisterJob(com);
	    me.RegisterFinder(finder);
	    finder.findjob();
    }
}
