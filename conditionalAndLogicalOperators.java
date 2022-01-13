import java.lang.*;
import java.util.*;
class conditionalAndLogicalOperators
{
    public static void main(String args[])
    {
        System.out.println("Enter Three Integers");
        int a,b,c;
        Scanner op=new Scanner(System.in);
        a=op.nextInt();
        b=op.nextInt();
        c=op.nextInt();
        System.out.println(a<b && b<c);
        System.out.println(a<b | b<c);

        if(a>0)
        {
            System.out.println("It Is A Positive Number");
        }
        else if(a==0)
        {
            System.out.println("It Is Neither Positive Nor Negative");
        }
        else
        {
            System.out.println("It Is A Negative Number");
        }
    }
}