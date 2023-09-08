package assignment1;

public class IneuronPattern {
	public static void main(String[] args) {
		//Printing Ineuron
		int n = 10;
		int space;
//1.printing I	
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				if (i == 1 && j <= n || j == n / 2 || i == n && j <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//2.Printing N
			for (int j = 1; j <= 10; j++)
				if (j == 1 || i == j || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//3. Printng E
			for (int j = 1; j <= n; j++)
				if (i == 1 && j <=10 || i == n/2 && j <=10 || i == n && j <=n || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//4. Printing U
			for (int j = 1; j <= n; j++)
				if (j == 1 && i <=n || i == n || j == n && i <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//5. Printing R
			for (int j = 1; j <= n; j++)
				if (i == 1 && j <=n  || j == 1 || i - j == n/2 || j == n && i <= n/2 && i > 1
						|| i == n/2 && j <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//6. Printing O
			for (int j = 1; j <= n; j++)
				if (i == 1 && j >= 1 && j <= n|| i == n && j > 1 && j <=n || j == 1 && i > 1 && i <=n
						|| j == n  && i > 1 && i <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
//7. Printing N
			for (int j = 1; j <=n; j++)
				if (j == 1 || i == j || j ==n)
					System.out.print("*");
				else
					System.out.print(" ");
			for (space = 1; space <= 3; space++)
				System.out.print(" ");
			System.out.println();
		}
	}
}