
import java.util.Scanner;


class Program30
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");

        String str = sobj.nextLine();

        System.out.println("Enter the word that you want to search:");
        String Word=sobj.nextLine();

        String Arr[] = str.split(" ");

        int iCount = 0;

        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i].equals(Word))
            {
                iCount++;
            }
        }
        System.out.println("Frequency of Demo word:" + iCount); // 7
    }
}