package stringPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter String to find Palindrome");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String st = sb.reverse().toString();
		if (str.toLowerCase().equals(st.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
		sc.close();
	}
}
