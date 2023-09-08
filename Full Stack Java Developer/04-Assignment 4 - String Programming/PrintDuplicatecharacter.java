package stringPrograms;

import java.util.Scanner;

public class PrintDuplicatecharacter {

	public static void main(String[] args) {
		System.out.println("Enter String to Print duplicate");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		int n = str.length;
		System.out.println("The string is:" + s);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i] == str[j]) {
					System.out.print(str[j] + " ");
					break;
				}
			}
		}
		sc.close();
	}
}
