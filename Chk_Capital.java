import java.lang.*;
import java.util.Scanner;


class ChkCapital
{
    public static void main(String arg[])
    {   
        System.out.println("Enter the one Chracter:");
        Scanner sobj=new Scanner(System.in);
        String cValue=sobj.nextLine();
       
        char Arr[]=cValue.toCharArray();
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
           if((Arr[i]>='a') && (Arr[i]<='z'))
             {
                  System.out.println(" "+cValue+ ":is a small case letter");
             }
           else
            {
                  System.out.println(" "+cValue+ ":is a not  small case letter");
            }
        }
    }
        
       
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
