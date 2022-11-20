import java.lang.*;
import java.util.*;

/*
Accept character from user and cheak wheather it is alphabet or not
Input:F
Output:It is an alphabet
Input:$
Output:It is not alphabet
*/

class Chk_alphabet
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in); //user Accept value
       boolean bret=false;

       System.out.println("Enter the chracter:");
       char ch=sobj.next().charAt(0);

       StringX sobj1=new StringX();  

       bret=sobj1.CheackAlphabet(ch);
       if(bret==true)
       {
          System.out.println("it is an Alphabet");
       }
       else
       {
        System.out.println("it is not alphabet");
       }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
class StringX
{
    public boolean CheackAlphabet(char cValue)    
    {
        if(((cValue>='A')||(cValue<='Z'))&&(cValue>='a')||(cValue<='z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
