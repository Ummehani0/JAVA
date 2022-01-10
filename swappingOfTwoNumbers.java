package swappingOfTwoNumbers;
import java.util.Scanner;
public class swappingOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter two numbers");
		Scanner scanner1 = new Scanner(System.in);
		int num1 = scanner1.nextInt();
		int num2 = scanner1.nextInt();
		System.out.println("Before Swaping a Number num1="+num1+"  num2="+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swaping a Number num2="+num1+"  num2="+num2);

	}

}
