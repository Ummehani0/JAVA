package oddevn;

import java.util.Scanner;

public class oddevn {
		public static void main(String [] args) {
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter a  Number");
			
			int enteredNumber = scanner1.nextInt();
			
			if (enteredNumber%2 == 0) {
				System.out.println("The Number Entered is Even");
			}
			else 
				System.out.println("The Number Entered is odd");
		}
	}