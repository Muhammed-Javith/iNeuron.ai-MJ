package stringPrograms;

import java.util.Scanner;

public class PangramStringCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to find Panagram");
		String str = scan.nextLine();
		str=str.replace(" ", "");
		str = str.toLowerCase();
		boolean allLetterPresent = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}
		scan.close();
		if (allLetterPresent)
			System.out.println("str string is a Panagram");
		else
			System.out.println("str string is not  a Panagram");
	}

}
