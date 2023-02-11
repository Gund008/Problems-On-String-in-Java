
import java.util.Scanner;

class Program338
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String:");
        String str=sobj.nextLine();

        String data=str.replaceAll("\\+"," ");  //Multiple White Spaces(regular)
        
        String newstr=data.trim();

        String Arr[]=str.split(" ");  //Conversion

        System.out.println("Number of words are:"+Arr.length);
        
    }
}
