import java.lang.*;
import java.util.Scanner;


class ChkSmall
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
           if((Arr[i]>='A') && (Arr[i]<='Z'))
             {
                  System.out.println(" "+cValue+ ":is a Small case letter");
             }
           else
            {
                  System.out.println(" "+cValue+ ":is a not  Small case letter");
            }
        }
    }
        
       
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
