/*
 * Write a Java Program which accept string from user and print Frequency of each word.
 * Input:India is Demo India Hello Demo
 * Output: India  2
 *         is     1
 *         Demo   2
 *         Hello  1
 */
import java.util.HashMap;
import java.lang.*;
import java.util.Scanner;


 class p
 {
    public static void main(String arg[])
    {
        int iCnt=0,i=0,iCount=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the String");
        String str=sobj.nextLine();

        String Arr[]=str.split(" ");

        HashMap <String,Integer> hobj=new HashMap<>();
        int Frequency=0;

        for(String ch:Arr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency=hobj.get(ch);
                hobj.put(ch,Frequency + 1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }
        System.out.println(hobj);
    }
    
 }