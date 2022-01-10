package com.increasenumber.training;
import java.util.Scanner;
public class increasingNumber {
       public boolean checkNumber(int num)
       {
              boolean condition=false;
              String str11 = String.valueOf(num);
              int l = str11.length();
              for(int j=0;j<l-1;j++)
              {
                     if(str11.charAt(j)<=str11.charAt(j+1) )
                           condition=true;
                     else
                           condition=false;
              }
              return condition;
       }
       public static void main(String[] ar)
       {
    	   increasingNumber inc = new increasingNumber();
              Scanner scanner1 = new Scanner(System.in);
              System.out.println("Enter any number:");
              int num = scanner1.nextInt();
              System.out.println("increasing number: "+inc.checkNumber(num));
       }
}