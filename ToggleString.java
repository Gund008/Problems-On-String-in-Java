import java.util.Scanner;

/*
 * Accept string from user and reverse the contents of that string by toggling the case.
 * Input :"aCBdef"
 * Output:"FEDbcA"
 */

 class StringDemo
 {
    public void strRevTog(String str)
    {
       char Arr[]=str.toCharArray();
      
        for(int iCnt=Arr.length-1;iCnt>=0;iCnt--)
        {
           if((Arr[iCnt]>='A')&&(Arr[iCnt]<='Z'))
           {
               char str1=(char)(Arr[iCnt]+32);
               System.out.print(str1);
           }
           else if((Arr[iCnt]>='a')&&(Arr[iCnt]<='z'))
           {
               char str2=(char)(Arr[iCnt]-32);
               System.out.print(str2);
           }
        }
        System.out.println(" ");
    }
 }
/////////////////////////////////////////////////////////////////////////////////////////////////

 class Program4
 {
   public static void main(String arg[])
   {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Please Enter the String:");
      String str=sobj.nextLine();

      StringDemo aobj=new StringDemo();
      aobj.strRevTog(str);
   
   }
 }