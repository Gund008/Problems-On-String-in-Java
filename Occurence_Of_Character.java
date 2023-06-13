import java.util.Scanner;

/* 
* Write a Java Program which accept array of characters from user and accept one character.return Occurence of that character without considering case.
* Input: b N e B R b A i G i B
*        b
* Output:4
*   
*/

class ArrayX
{
    public char Arr[];

    public ArrayX(int iValue)
    {
        Arr=new char[iValue];
    }

    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the Array Elements:");
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.next().charAt(0);
        }
        System.out.println(" ");
    }

    public int  Count(char cValue)
    {
        int i=0;
        
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]=='B')
            {
               Arr[iCnt]='b';
            }   
            
            if(Arr[iCnt]==cValue)
            {
                i++;
            }
        }
        return i;
    }
}

 class Program3
 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the Size of Array:");
        int iNo=sobj.nextInt();
        
        System.out.println("Please Enter the Chracter:");
        char cValue=sobj.next().charAt(0);

        ArrayX aobj=new ArrayX(iNo);
        aobj.accept();
        int iRet=aobj.Count(cValue);
        System.out.print(iRet);
    }
 }
