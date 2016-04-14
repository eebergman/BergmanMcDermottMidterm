
package com.midterm.bergmanmcdermott;

public class Validation {

	public static String encryDecry(String enDeString) {
		String checkThis = enDeString.toLowerCase();
		String hereIsAString = null;

		if (checkThis.equalsIgnoreCase("e")) {
			hereIsAString = "encry";
		} else if (checkThis.equalsIgnoreCase("d")) {
			hereIsAString = "decry";
		}

		return hereIsAString;
	}
}
