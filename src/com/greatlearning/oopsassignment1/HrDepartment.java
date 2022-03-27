package com.greatlearning.oopsassignment1;

public class HrDepartment extends SuperDepartment {
    public String departmentName(){
        detail = "Hr Department";
        System.out.println("Welcome to "+detail);
        return (detail);
    }
    public String getTodaysWork(){
        detail = "Fill today’s timesheet and mark your attendance";
        System.out.println(detail);
        return (detail);
    }
    public String getWorkDeadline(){
        detail = "Complete by EOD";
        System.out.println(detail);
        return (detail);
    }
    public String doActivity(){
        detail = "team Lunch";
        System.out.println(detail);
        return (detail);
    }
}
