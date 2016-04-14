
package com.midterm.bergmanmcdermott;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptionApp implements CharSequence {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stayOrGo;
		String validation;
		String toEncrypt;
		String toDecrypt;
		String choice;
		StringBuilder translated = new StringBuilder();
		ArrayList<Character> input = new ArrayList<Character>();

		ArrayList<Character> alpha = new ArrayList<Character>(
				Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
						's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '!', '?', ',', '.'));

		ArrayList<Character> key = new ArrayList<Character>(
				Arrays.asList('x', 'f', 's', 'd', 'p', 'j', 'a', 'k', 'q', 'u', 'h', 'i', 'l', 'v', 'm', 'g', 'y', 'w',
						'r', 't', 'c', 'o', 'z', 'e', 'n', 'b', ' ', '?', '.', '!', ','));

		System.out.println("Welcome to the Top Secret Encryption Program.");

		validation = toEncryptOrDecrypt(sc);
		do {
			while (validation == null) {
				System.out.println("Invalid response, please select only 'E' or 'D'");
				validation = Validation.encryDecry(validation = sc.nextLine());
			}

			if (validation == "encry") {

				System.out.println("\nPlease enter your message to encrypt...");

				toEncrypt = sc.nextLine().toLowerCase();
				CharSequence nowStringIsChar = (toEncrypt);

				for (int i = 0; i < nowStringIsChar.length(); i++) {
					input.add(nowStringIsChar.charAt(i));
				}

				for (int i = 0; i < input.size(); i++) {
					char a = input.get(i);

					int b = alpha.indexOf(a);

					char c = key.get(b);

					System.out.print(c);
				}

			} else if (validation == "decry") {

				System.out.println("\nPlease enter your message to decrypt...");

				toDecrypt = sc.nextLine().toLowerCase();
				CharSequence nowStringIsChar = (toDecrypt);

				for (int i = 0; i < nowStringIsChar.length(); i++) {
					input.add(nowStringIsChar.charAt(i));
				}

				for (int i = 0; i < input.size(); i++) {
					char a = input.get(i);

					int b = key.indexOf(a);

					char c = alpha.get(b);

					System.out.print(c);

				}
				if (false == true) {
					System.out.println();
				}
			}
			input.clear();
			validation = toEncryptOrDecrypt(sc);
		} while (validation == "encry" || validation == "decry");
	}

	public static String toEncryptOrDecrypt(Scanner sc) {
		String stayOrGo;
		String validation;
		System.out.println("\n\nWould you like to encrypt or decrypt a message?" + "\n\tPress 'E' to encrypt a message"
				+ "\n\tPress 'D' to decrypt a message");
		validation = Validation.encryDecry(stayOrGo = sc.nextLine());
		return validation;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

}
