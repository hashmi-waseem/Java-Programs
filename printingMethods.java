import java.lang.*;
import java.util.*;
class printingMethods
{
    public static void main(String args[])
    {
        int a=10;
        float b=3.1523f;
        String s="Waseem";
        System.out.printf("%3$d %2$f %1$s  \n",s,b,a);            //Printing on basis of order decided.
        System.out.printf("%18s   \n",s);                         //Leaving Spaces and then printing.
        System.out.printf("%018d  \n",a);                         //Printing 0 in the spaces.
        System.out.printf("%+18.2f",b);                           //Prints the sign of number automatically, .2 means 2 places after decimal.
    }
}