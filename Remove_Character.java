import java.util.Scanner;

/*
 * Write a Java Program which accept string and one character from user and remove that character from string.
 * Input:IndiaisDemoIndia
 *       i
 * Output:IndasDemoInda
 */

 
 class Program4
 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the First String");
        String str=sobj.nextLine();

        System.out.println("Please Enter the Character the String");
        String ch=sobj.next();

        String strNew=str.replace(ch,"");

        System.out.println(strNew);

    }
 }