package com.greatlearning;

import com.greatlearning.oopsassignment1.AdminDepartment;
import com.greatlearning.oopsassignment1.HrDepartment;
import com.greatlearning.oopsassignment1.TechDepartment;

public class Main {

    public static void main(String[] args) {
        HrDepartment hr = new HrDepartment();
        AdminDepartment admin = new AdminDepartment();
        TechDepartment tech = new TechDepartment();
        admin.departmentName();
        admin.getTodaysWork();
        admin.getWorkDeadline();
        admin.isTodayAHoliday();
        System.out.println();
        hr.departmentName();
        hr.doActivity();
        hr.getTodaysWork();
        hr.getWorkDeadline();
        hr.isTodayAHoliday();
        System.out.println();
        tech.departmentName();
        tech.getTodaysWork();
        tech.getWorkDeadline();
        tech.getTechStackInformation();
        tech.isTodayAHoliday();
    }
}
