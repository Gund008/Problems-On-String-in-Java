import java.util.Scanner;

/*
Write a Java Program which accept 2 String from user and concat N characters of second string after first string.Value of N
should be accepted from user.

Note-If Third parameter is greater than the size of second string then concate whole string after first string.

Input: "Marvellous Infosystems"
        "Logic Building"
        5
Output:"Marvellous Infosystems Logic"        

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the First String:");
        String str1=sobj.nextLine();
        
        System.out.println("Please Enter the Second String:");
        String str2=sobj.nextLine();

        System.out.println("Please Enter the Number");
        int iNo=sobj.nextInt();

        char Arr[]=str1.toCharArray();
        char Brr[]=str2.toCharArray();

        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]);
        }
        for(int i=0;i<iNo;i++)
        {
            System.out.print(Brr[i]); 
        }
        System.out.println("");
    }
}
