package palindrome;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args)
	{
		Scanner scanner1 = new Scanner(System.in);
	
		System.out.println("Enter a String : ");				
		String str = scanner1.next();
		
		int len = str.length();

		String string1 = "";
		for(int i = 0 ; i < len ; i++)
		{
			char ch = str.charAt(i);
			string1 = ch + string1;	
		}
	
		if(str.equals(string1))
			System.out.print("Entered String is a Palindrome");
		else
			System.out.print("Entered String is Not a Palindrome");												
	}
}
