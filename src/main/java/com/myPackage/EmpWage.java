package com.myPackage;

public class EmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME =2;
    public static final int MAX_WORKING_HOUR=100;
    public static final int MAX_DAYS=20;
    public static final int WAGE_PER_HOUR=20;

    public int getWorkingHours(int choice) {
        int empHrs = 0;
        switch (choice) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        return empHrs;
    }
    //method create
        public void calculateEmployeeHours()
        {
            int empHr = 0;
            int totalEmpHr = 0;
            int totalWorkingDays = 0;
            int totalMonthlywage=0;
            double salary, totalSalary = 0;
            while (totalWorkingDays < MAX_DAYS && totalEmpHr < MAX_WORKING_HOUR)
            {
                int choice= (int) Math.floor(Math.random() * 10) % 3;
                //method call
                empHr = getWorkingHours(choice);
                // calculate total emp hours
                totalEmpHr = (totalEmpHr + empHr);
                // calculate daily emp hour for month
                int array[]=new int [25];
                totalWorkingDays++;
                array[totalWorkingDays]=dailyWage(empHr);
                System.out.println("array[totalWorkingDays]");

                // monthly wage
                totalMonthlywage=(totalMonthlywage+array[totalWorkingDays]);
            }
            System.out.println(totalMonthlywage);
            totalSalary = (totalEmpHr + WAGE_PER_HOUR);
            System.out.println("total salary" + totalSalary);
        }
        // create method
        public int dailyWage(int empHr)
        {
            int dailywage=0;
            dailywage=(WAGE_PER_HOUR*empHr);
            return dailywage;
        }
    public static void main(String[]args) {
        // object of class
        EmpWage emp = new EmpWage();
        // call method
        emp.calculateEmployeeHours();
    }
    }

