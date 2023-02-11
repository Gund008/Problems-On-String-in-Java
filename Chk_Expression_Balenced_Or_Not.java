import java.util.Scanner;
import java.util.Stack;
import java.util.WeakHashMap;

/*
 * write a java Program which accept expression from user Check whether the expression is balanced Parenthesised or not(Expression should contains only circular Brackets.)
 * Input:(1+(f-g)*2(a-d))
 * Output:True
 * 
 * Input:(a+(f-g)*2(a-d))
 * Output:False
 */

 class Expression
 {
    Stack<Integer>stack=new Stack<Integer>();
    Scanner sobj=new Scanner(System.in);
    
    public boolean check()  //check whether true or false
    {
        System.out.println("Please Enter the Expression:");
        String str=sobj.next();  //character

        char[]exp=str.toCharArray();
        int size;
        for(int i=0;i<exp.length;i++)
        {
            char ch=str.charAt(0);

            if(ch== '(' || ch== '[' || ch=='{' )
            {
                 stack.push(i);
            }
            else if(ch==')'|| ch==']' ||ch=='}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(stack.pop()!=ch)
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
 }

///////////////////////////////////////////////////////////////////////////////////////////////

 class Program5
 {
    public static void main(String arg[]) 
    {
        Expression eobj=new Expression();
        boolean bRet=eobj.check();

        if(bRet==true)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
 }