package com.greatlearning.oopsassignment1;

public class AdminDepartment extends SuperDepartment {
    public String departmentName(){
        detail = "Admin Department";
        System.out.println("Welcome to "+detail);
        return (detail);
    }
    public String getTodaysWork(){
        detail = "Complete your documents Submission";
        System.out.println(detail);
        return (detail);
    }
    public String getWorkDeadline(){
        detail = "Complete by EOD";
        System.out.println(detail);
        return (detail);
    }
}
