import java.lang.*;
import java.util.*;
class bitWiseOperator
{
    public static void main(String args[])
    {
        int x=0b0110;
        int y=0b01010;
        int z,a,b;
        z=x&y;
        a=x|y;
        b=x^y;
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
}