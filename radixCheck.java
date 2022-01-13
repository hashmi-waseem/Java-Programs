import java.lang.*;
import java.util.*;
class radixCheck
{
    public static void main(String args[])
    {
        System.out.println("Enter A Number To Check Radix");
        Scanner ra=new Scanner(System.in);
        String a;
        a=ra.nextLine();
        if(a.matches("[0 1]+"))
        {
            System.out.println("it Is A Binary Number");
        }
        else if(a.matches("[0-8]+"))
        {
            System.out.println("It Is A Octal Number");
        }
        else if(a.matches("[0-9]+"))
        {
            System.out.println("It Is A Decimal Number");
        }
        else if(a.matches("[A-F 0-9]+"))
        {
            System.out.println("It Is A HexaDecimal Number");
        }
        else
        {
            System.out.println("It Is Invalid Number");
        }
    }
}