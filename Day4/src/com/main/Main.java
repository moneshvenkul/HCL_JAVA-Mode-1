package com.main;

import java.util.Scanner;

import com.processing.Process;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :");
		String word = sc.nextLine();
		System.out.println("Enter the Character :");
		char character = sc.next().charAt(0);
		Process counts = new Process();
		System.out.println(counts.countChar(word, character));
		System.out.println(counts.searchString(word, character));
		sc.close();

	}
}
