package fact;
import java.util.Scanner;

public class factorial {
public static void main(String [] args) {
	int i,fact1=1;
	Scanner scanner1 =new Scanner(System.in);
	System.out.println("Enter Any Number");
	int Number = scanner1.nextInt();
	fact1=factorial(Number);
	System.out.println("Factorial of "+Number+" is:"+fact1);
}
static int factorial(int num) {
	if(num==0)
		return 1;
	else
		return (num*factorial(num-1));
}
}