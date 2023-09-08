package stringPrograms;

import java.util.*;

public class AnagramStringcheck {
	public static void main(String[] args) {
		String str1, str2;
		int len1, len2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String :");
		str1 = scan.nextLine();
		System.out.print("Enter Second String :");
		str2 = scan.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str1 = str1.replaceAll("s", "");
		str2 = str2.replaceAll("s", "");
		len1 = str1.length();
		len2 = str2.length();
		if (len1 == len2) {
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			boolean result = Arrays.equals(s1, s2);
			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
		scan.close();
	}
}