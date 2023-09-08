package stringPrograms;

import java.util.Scanner;

public class UniqueCharacterString {
	boolean uniqueCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		UniqueCharacterString ucs = new UniqueCharacterString();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to find UniqueCharacters");
		String str = scan.nextLine();
		if (ucs.uniqueCharacters(str)) {
			System.out.println("The String " + str + " has all unique characters");
		} else {
			System.out.println("The String " + str + " has duplicate characters");
		}
		scan.close();

	}

}
