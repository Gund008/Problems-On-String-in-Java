import java.lang.*;
import java.util.Scanner;

class Name
{
    public static void main(String arg[])
    {
        System.out.println("Please Enter Your Full name:");
        Scanner sobj= new Scanner(System.in);
        String cValue=sobj.nextLine();

        char Arr[]=cValue.toCharArray();
        System.out.println("Your name is:" +" "+cValue);
    }

}