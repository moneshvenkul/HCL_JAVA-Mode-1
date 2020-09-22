package com.processing;

public class Process {

	public int countChar(String string, char character) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == character) {
				count++;
			}
		}

		return count;
	}

	public int searchString(String string, char character) {
		int characterPosition = 0;
		char[] stringArray = string.toCharArray();
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] == character) {
				characterPosition = i;
				break;
			}
		}

		return characterPosition;

	}

}
