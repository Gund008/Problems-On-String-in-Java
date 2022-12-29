/*
write a java Program which accept string from user and display it in reverse order.
Input :-"MarvellouS"
Output :-"SuollevraM"
*/

import java.util.*;
import java.lang.*;

class MarvellousX
{
    public String str;

    public MarvellousX(String A)
    { 
        this.str=A;
    }
    public void reverse()
    {
        char Arr[]=str.toCharArray();
        for(int i=Arr.length-1;i>=0;i--)
        {
            System.out.print(Arr[i]);
        }
        System.out.println("");
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class Program5
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter String:");
        String str=sobj.nextLine();

        MarvellousX mobj=new MarvellousX(str);
        mobj.reverse();
    }
}