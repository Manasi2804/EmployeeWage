package com.myPackage;

public class EmpWage {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOURS = 20;

        // checking employee is present or absent

    public static void calculateDailyEmpWage() {
        int empHrs = 0;
        int empWage = 0;

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
        // calculate daily employee wage
        empWage = empHrs * EMP_RATE_PER_HOURS;
        System.out.println("Daily Employee Wage:" + empWage);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        calculateDailyEmpWage();
    }
}
