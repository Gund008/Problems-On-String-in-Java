import java.util.Scanner;

class Program25
{
    public static void main(String arg[])
    {
        Scanner  sobj=new Scanner(System.in);
        System.out.println("Enter the String:");

        String str=sobj.nextLine();
       
        String Arr[]=str.split(" ");  //Toknazation of String  

        System.out.println("Number of word are:"+Arr.length);  //length
    }
}
