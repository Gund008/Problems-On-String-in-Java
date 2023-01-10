/*
write a java Program which accept string from user and check whether it contains vowels in it or  not.
Input : "Marvellous"
Output :TRUE

Input :-"Demo"
Output:-TRUE

Input :"xyz"
Output :FALSE

*/
import java.lang.*;
import java.util.Scanner;

class Program4
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter String :");
        String str=sobj.nextLine();

        MarvellouSX  mobj=new MarvellouSX();
        boolean bRet=mobj.checkX(str);

        if(bRet==false)
        {
            System.out.println("FALSE");
        }
        else
        {
            System.out.println("TRUE");
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////

class MarvellouSX
{
    public boolean checkX(String str)
    {
       int i=0;
       char Arr[]=str.toCharArray();
       boolean bFlag=false;
       
       for(i=0;i<Arr.length;i++)
       {
           if((Arr[i]=='a')|| (Arr[i]=='e') || (Arr[i]=='i') || (Arr[i]=='o')||(Arr[i]=='u'))
           {
               bFlag=true;
               break;
           }
       }
       return bFlag;
    }
}
