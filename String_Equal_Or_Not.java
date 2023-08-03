import java.util.Scanner;

/*
Write a Java Program which accept 2 String from user and check whether content of two strings are equal or not.

Input: "Marvellous Infosystem"
        "Marvellous Infosystems"
Output: TRUE
*/

class StringDemo
{
    public boolean strCmpX(String src,String dest)
    {
        char Arr[]=src.toCharArray();
        char Brr[]=dest.toCharArray();
        boolean bFlag=true;

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]!=Brr[iCnt])
            {
                bFlag=false;
                break;
            }
            Arr[iCnt]++;
            Brr[iCnt]++;
        }
        return bFlag;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program2
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the First String:");
        String str1=sobj.nextLine();
        
        System.out.println("Please Enter the Second String:");
        String str2=sobj.nextLine();

        StringDemo aobj=new StringDemo();
        boolean bRet=aobj.strCmpX(str1,str2);
        if(bRet==true)
        {
           System.out.println("TRUE");
        }
        else 
        {
           System.out.println("FALSE");
        }
    }
}
