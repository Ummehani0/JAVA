package pnUpToInt;
import java.util.Scanner;
public class pnUpToInteger {
	public static void main(String[] args) {
	
		int num,r;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of Number ");
		num = s.nextInt();
		System.out.println("\n Prime Numbers are :");
		for (int n = 2; n<=num; n++ )
		{
r=0;
for (int m=2; m<=n/2; m++)


	if ((n%m)==0)
	{
		r=1;
		break;
	}
	if(r==0)
	
		System.out.println(n+" ");
	
	

}}}