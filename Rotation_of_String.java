/*
 * Write a java Program which accept two string from user and check whether First String is the rotation of second string or not.
 * Input:abcdefg   cdefgab
 * Output:True
 */

import java.lang.*;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

 class Program1
 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the First String:");
        String str1=sobj.nextLine();

        System.out.println("Please Enter the Second String:");
        String str2=sobj.nextLine();

        if(str1.length()==str2.length())  //(7==7)
        {
            //Convert String to Array
            char Arr[]=str1.toCharArray();
            char Brr[]=str2.toCharArray();
            
            Arrays.sort(Arr);
            Arrays.sort(Brr);
         
            boolean result=Arrays.equals(Arr,Brr);

            if(result==true)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
 }
