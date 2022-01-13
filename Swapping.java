import java.lang.*;
import java.util.*;
class Swapping
{
    public static void main(String args[])
    {
        int a=10;
        int b=19;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}