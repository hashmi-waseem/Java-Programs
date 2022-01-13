import java.lang.*;
import java.util.*;
class evenAndOddNumbers
{
    public static void main(String args[])
    {
        System.out.println("Enter A Number To Check Whether It Is Even Or Odd");
        Scanner eo=new Scanner(System.in);
        int a;
        a=eo.nextInt();
        if(a%2==0)
        {
            System.out.println("It Is A Even Number");
        }
        else
        {
            System.out.println("It Is A Odd Number");
        }
    }
}