package com.myPackage;

public class EmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOURS = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int NUM_OF_HOURS = 100;

    // checking employee is present or absent

    public static void calculateWageForMonth() {
        int empHrs = 0;
        int totalEmpHr = 0;
        int day=0;
        double salary, totalSalary = 0;
        while (totalEmpHr<= NUM_OF_HOURS && day < NUM_OF_WORKING_DAYS) {
            day++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalSalary = totalEmpHr + empHrs;
        }
        // calculate daily employee wage
        totalSalary = totalEmpHr * EMP_RATE_PER_HOURS;
        System.out.println("Monthly Employee Wage:" + totalSalary);
    }

    public static void main(String[]args){
        System.out.println("Welcome to employee wage");
        calculateWageForMonth();
    }
}
