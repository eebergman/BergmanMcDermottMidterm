
package com.midterm.bergmanmcdermott;

import java.util.Scanner;

public class Validation {

	public static String encryDecry(String enDeString) {
		String checkThis = enDeString.toLowerCase();
		String hereIsAString = null;

		if (checkThis.equalsIgnoreCase("e")) {
			hereIsAString = "encry";
		} else if (checkThis.equalsIgnoreCase("d")) {
			hereIsAString = "decry";
		} else {
			invalid(enDeString);
		}

		return hereIsAString;

	}

	public static void invalid(String validateString) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"I'm sorry that is not a valid input.");
		EncryptionApp.main(null);
		
		scan.close();
	}
}
