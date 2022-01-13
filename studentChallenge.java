import java.lang.*;
import java.util.*;
class studentChallenge
{
    public static void main(String args[])
    {
        int a=11110;
        String s=String.valueOf(a);
        boolean b=s.matches("[01]*");
        System.out.println(b);
        System.out.println(s);

        int n=0xA;
        String t=String.valueOf(n);
        boolean c=t.matches("[A-E]*[1-9]*");
        System.out.println(c);
        System.out.println(t);

        String q="25/04/2000";
        boolean w=q.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}");
        System.out.println(w);
    }
}