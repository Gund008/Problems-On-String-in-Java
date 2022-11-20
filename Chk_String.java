import java.lang.*;  
import java.util.*;

class Chk_String
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the string:");
       String  str=sobj.nextLine();   

       char Aee[]=str.toCharArray();

       for(int i=0;i<Aee.length;i++)
       {
        System.out.println(Aee[i]);


       }
    }
}