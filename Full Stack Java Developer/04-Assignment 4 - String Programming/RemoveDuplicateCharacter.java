package stringPrograms;

import java.util.*;

public class RemoveDuplicateCharacter {
	static void removeDuplicate(char str[], int n) {
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
		for (char x : str)
			s.add(x);
		for (char x : s)
			System.out.print(x);
	}

	public static void main(String[] args) {
		System.out.println("Enter String to remove duplicate");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char str[] = s.toCharArray();
		int n = str.length;
		removeDuplicate(str, n);
		sc.close();
	}

}
