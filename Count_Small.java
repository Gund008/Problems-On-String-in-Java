import java.util.*;
import java.io.*;

class Count_Small
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the string:");
       String  str=sobj.nextLine();   

       char Arr[]=str.toCharArray();
       int i=0;

       for( i=0;i<Arr.length;i++)
       {
          if((Arr[i]>='a')&&(Arr[i]<='z'))
          {
            i++;
          }
          System.out.println("Number of small case letter:+i");
       }
    }

}