package prime;
import java.util.Scanner;
public class primeOrNot
{
 public static void main(String args[])
        {
          int num,f;
         Scanner scanner1=new Scanner(System.in);
         System.out.println("Enter n value:  ");
         num=scanner1.nextInt();
         System.out.println("Primenumbers are : ");
          for(int i=2;i<=num;i++)
              {
                f=0;
                for(int j=2;j<=i/2;j++)
                if((i%j)==0)
                   {
                      f=1;
                      break;
                   }
                 if(f==0)
                 System.out.print(i+"   ");
                        }
            }
}
