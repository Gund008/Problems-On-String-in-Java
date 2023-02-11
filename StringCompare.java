//.equals Function

import java.util.Scanner;
import java.util.concurrent.FutureTask;

class StringX
{
    public String str1;
    public String str2;

    public StringX(String A,String B)
    {
        str1=A;
        str2=B;
    }
    public boolean Chk()
        {
            if(str1.equals(str2))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
///////////////////////////////////////////////////////////////////////////////////////////


public class StringCompare 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the First String:");
        String str1=sobj.nextLine();

        System.out.println("Please Enter the Second String:");
        String str2=sobj.nextLine();

        StringX sobj1=new StringX(str1,str2);

        boolean bRet=sobj1.Chk();

        if(bRet==true)
        {
            System.out.println("String Are Same");
        }
        else
        {
            System.out.println("String are Not Same");
        }
    }    
}
