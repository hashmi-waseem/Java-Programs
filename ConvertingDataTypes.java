import java.lang.*;
import java.util.*;
class ConvertingDataTypes
{
    public static void main(String args[])
    {
        int a=200;
        String b=Integer.toBinaryString(a);
        String c=Integer.toHexString(a);
        String d=Integer.toOctalString(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}