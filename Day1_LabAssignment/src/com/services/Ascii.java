package com.services;

public class Ascii {

	public void ascii_value() {

		char ch = 'a';
		int ascii = ch;
		// You can also cast char to int
		int castAscii = ch;

		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		System.out.println("The ASCII value of " + ch + " is: " + castAscii);
	}
}