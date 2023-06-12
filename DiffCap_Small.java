//Write a Java Program which accept string from user and return diffrence between frequency of small character and frequency of capital characters.
//Input :-"MarvellouS"
//Output :- 6(8-2)

import java.lang.*;
import java.util.*;

class MarvellousX
{
    public int countDiff(String str)
    {
        int iCnt=0;
        int iCnt1=0;
        int iCnt2=0;
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            if((str.charAt(iCnt)>='a')&&(str.charAt(iCnt)<='z'))
            {
                iCnt1++;
            }
        }
        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            if((str.charAt(iCnt)>='A')&&(str.charAt(iCnt)<='Z'))
            {
                iCnt2++;
            }
        }
        return iCnt1-iCnt2;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////

class Program3
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the String:");
        String str=sobj.nextLine();

        MarvellousX nobj=new MarvellousX();
        int iRet=nobj.countDiff(str);
        System.out.println("Diff between Capital And Small Character:"+iRet);
    }
}

