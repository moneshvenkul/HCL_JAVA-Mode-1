package com.services;

import java.util.Scanner;

public class Smallest {
	public void smaller() {

		Scanner scan = new Scanner(System.in);
//create a scanner object for input

		System.out.print("Enter the first number\n");
		int num1 = scan.nextInt();// reads num1 from user
		System.out.print("Enter the second number\n");

		int num2 = scan.nextInt();
		;// reads num2 from user
		System.out.print("Enter the Third number\n");

		int num3 = scan.nextInt();
		;// reads num3 from user
		scan.close();
//calling the method
		findLargest(num1, num2, num3);

	}

	static void findLargest(int num1, int num2, int num3) {// method definition
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " is the smallest number");

		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " is the smallest number");

		} else {
			System.out.println(num3 + " is the smallest number");

		}

	}

}