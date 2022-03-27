package com.greatlearning.oopsassignment1;

public class TechDepartment extends SuperDepartment {
    public String departmentName(){
        detail = "Tech Department";
        System.out.println("Welcome to "+detail);
        return (detail);
    }
    public String getTodaysWork(){
        detail = "Complete coding of module 1";
        System.out.println(detail);
        return (detail);
    }
    public String getWorkDeadline(){
        detail = "Complete by EOD";
        System.out.println(detail);
        return (detail);
    }
    public String getTechStackInformation(){
        detail = "core Java";
        System.out.println(detail);
        return (detail);
    }
}
