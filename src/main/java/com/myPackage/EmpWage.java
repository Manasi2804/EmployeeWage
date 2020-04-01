package com.myPackage;

public class EmpWage {

    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOURS = 20;

        // checking employee is present or absent

    public static void calculateDailyEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;

        // calculate daily employee wage
        empWage=empHrs * EMP_RATE_PER_HOURS;
        System.out.println("Daily Employee Wage:" + empWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
    }
}
