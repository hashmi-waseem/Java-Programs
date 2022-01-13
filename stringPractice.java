import java.lang.*;
import java.util.*;
class stringPractice
{
    public static void main(String args[])
    {
        String s="a";
        boolean a=s.matches("[^ac]");
        System.out.println(a);

        String t="waseem9";
        boolean b=t.matches("[a-z][1-9]");
        System.out.println(b);
        boolean c=t.matches("[a-z]*[1-9]*");
        System.out.println(c);

        String d="waseemhashmi39@gmail.com";
        boolean e=d.matches(".*gmail.com");
        System.out.println(e);
    }
}