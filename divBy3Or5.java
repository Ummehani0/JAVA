package div3or5;
import java.util.Scanner;
public class divBy3Or5 {

       private int initial=0;
       public int findTheSummation(int n)
       {
              for(int i=0;i<=n;i++)
              {
                     if(i%3==0||i%5==0)
                     {
                           initial=initial+i;
                     }
              }
              return initial;
       }
       public static void main(String[] args[])
       {
    	   divBy3Or5 divby = new divBy3Or5();
              Scanner scanner1 = new Scanner(System.in);
              int n=scanner1.nextInt();
              System.out.println(divby.findTheSummation(n));
       }
}