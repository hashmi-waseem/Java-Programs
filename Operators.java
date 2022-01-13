import java.lang.*;
import java.util.*;
class Operators
{
    public static void main(String args[])
    {
        int a;
        int b;
        float c,e;
        System.out.println("Enter First Digit");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter Second Digit");
        b=sc.nextInt();
        System.out.println("Enter Decimal Number");
        c=sc.nextFloat();
        e=c%b;
        System.out.println(e);
        System.out.println(a+b);
    }
}