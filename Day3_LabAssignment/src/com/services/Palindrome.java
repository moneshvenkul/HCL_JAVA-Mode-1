package com.services;

import java.util.Scanner;

public class Palindrome {

	public void palindrome() {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String result = "Yes";
		int length = A.length();
		for (int i = 0; i < length / 2; i++) {
			if (A.substring(i, i + 1).equals(A.substring(length - i - 1, length - i))) {
			} else {
				result = "No";
			}
		}
		System.out.println(result);
		sc.close();
	}
}