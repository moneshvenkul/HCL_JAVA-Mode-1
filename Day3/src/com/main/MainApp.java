package com.main;

import java.util.Scanner;

import com.department.Employee;
import com.department.EmployeeProcessing;

public class MainApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Monesh", 5000f);
		Employee employee2 = new Employee(2, "Venkul", 6000f);
		Employee employee3 = new Employee(3, "Vommi", 7000f);
		EmployeeProcessing employeeProcessing = new EmployeeProcessing();
		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;

		boolean repeat = true;
		while (repeat) {
			System.out.println("1 Search Employees By name");
			System.out.println("2 Increase salary of Employees");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			if (choice == 1) {
				Employee[] serachEmployees = employeeProcessing.searchByName(employees);
				for (int i = 0; i < serachEmployees.length; i++) {
					if (serachEmployees[i] != null) {
						System.out.println(serachEmployees[i]);
					}

				}
			} else if (choice == 2) {

				Employee[] afterSalaryIncreasing = employeeProcessing.salaryIncrement(employees);
				for (int i = 0; i < afterSalaryIncreasing.length; i++) {
					System.out.println(afterSalaryIncreasing[i]);
				}
			} else {
				repeat = false;
			}
			scanner.close();

		}

	}

}
