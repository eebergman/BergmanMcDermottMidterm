
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

	public static String invalid(String validateString) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"I'm sorry that is not a valid input" + "\n\tPress 'E' to encrypt" + "\n\tPress 'D' to decrypt");
		String wasInvalid = sc.nextLine();

		return wasInvalid;

	}
}
