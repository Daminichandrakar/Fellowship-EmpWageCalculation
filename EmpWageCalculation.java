package com.bl.Emp;

public class EmpWageCalculation {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	public static int computeEmpWage(String company, int empRatePerHours, int numOfWorkingDay, int maxHoursPerMonth) {
		// variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		System.out.println("EmpWage calculation for company: " + company);
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "EmpHrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHours;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("Demart", 20, 2, 18);
		computeEmpWage("Relience", 10, 4, 18);
	}
}
