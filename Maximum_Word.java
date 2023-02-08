/*
 * Write a java Program which accept string from user and display such a word which occures maximum number of times.
 * Input:India is Demo India Hello Demo India
 * Output: India
 */


 import java.lang.*;
 import java.util.Scanner;
 
  class Program3
  {
     public static void main(String arg[])
     {
         Scanner sobj=new Scanner(System.in);
         System.out.println("Please Enter the String");
         String str=sobj.nextLine();
 
         String Arr[]=str.split(" ");
         System.out.println("Number of words are:"+Arr.length);
 
         int iMax=0;
         int iMaxIndex=0;
 
         for(int i=0;i<Arr.length;i++)
         {
             if(iMax < Arr[i].length())
             {
                 iMax=Arr[i].length();
                 iMaxIndex=i;
             }
            
         }
         System.out.println("Maximum Number of Times Ocuuring  Word in String: " +Arr[iMaxIndex]);
 
     }
  }