package com.power2.training;
import java.util.Scanner;
public class powerOfTwo {


       public boolean takeValue(int value)
       {
              boolean condition=false;
             
              if(value%2==0)
              {
                     int digit=2;
                     int power=1;
                     lab:
                     while(true)
                     {
                           for(int i=1;i<=value/2;i++)
                           {
                                  power =power*digit;
                                  if(power<value)
                                  {
                                         condition=false;
                                         continue;
                                  }
                                  else if(power==value)
                                  {
                                	  condition=true;
                                         break lab;
                                  }
                                  else if(power>value)
                                  {
                                	  condition=false;
                                         break lab;
                                  }
                           }
                     }
              }
              return condition;
       }
       public static void main(String[] ar)
       {
    	   powerOfTwo pwrtwo = new powerOfTwo();
              Scanner scanner1 = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = scanner1.nextInt();
              System.out.println("Power of two: "+pwrtwo.takeValue(num));
       }
}