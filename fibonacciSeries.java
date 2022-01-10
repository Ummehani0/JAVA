package fibonaciiSeries;
import java.util.Scanner;
public class fibonacciSeries {

    public static void main(String[] args) 
    {
        int number, value1 = 0,  value2= 0, value3 = 1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner1.nextInt();
        System.out.println("Fibonacci Series:");
        for(int i = 1; i <= number; i++)
        {
            value1 = value2;
            value2 = value3;
            value3 = value1 + value2;
            System.out.print(value1+" ");
        }
    }
}