package com.greatlearning.oopsassignment1;

public class SuperDepartment {
    public String detail;
    public String departmentName(){
        detail = "Super Department";
        System.out.println(detail);
        return(detail);
    }
    public String getTodaysWork(){
        detail = "No Work as of now";
        System.out.println(detail);
        return (detail);
    }
    public String getWorkDeadline(){
        detail = "Nil";
        System.out.println(detail);
        return (detail);
    }
    public String isTodayAHoliday(){
        detail = "Today is not a holiday";
        System.out.println(detail);
        return (detail);
    }
}
