import java.util.*;
import java.io.*;

class Length_Words
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the string:");
       String  str=sobj.nextLine();   

       String arr[]=str.split(" ");

       System.out.println("Number of words are:"+arr.length);
    }
}