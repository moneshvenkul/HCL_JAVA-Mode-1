package com.services;

public class Replace {

	public void repl() {
		String str = "The quick brown fox jumps over the lazy dog.";

		// Replace all the 'd' characters with 'f' characters.
		String new_str = str.replace('d', 'h');

		// Display the strings for comparison.
		System.out.println("Original string: " + str);
		System.out.println("New String: " + new_str);
	}
}
