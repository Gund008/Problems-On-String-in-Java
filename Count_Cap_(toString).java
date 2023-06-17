
import java.util.Scanner;

class Program335
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String:");
        String str=sobj.nextLine();  //String

        char Arr[]=str.toCharArray();  //to Array Conversion

        int iCnt=0;

        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i] >= 'A')&&(Arr[i]<='Z'))
            {
               Arr[i]=((char)(Arr[i] + 32));
            }
        }
        String output=Arr.toString();  //Array to String
        System.out.println(output);
       
    }
}
