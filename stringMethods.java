import java.lang.*;
import java.util.*;
class stringMethods
{
    public static void main(String args[])
    {
        String s=new String("   java.Programs.By.Me   ");
        String x="Compare.Me";
        int l=s.length();
        System.out.println(l);
        String t=s.toUpperCase();
        System.out.println(t);
        String u=s.trim();
        System.out.println(u);
        String v=s.substring(5,15);
        System.out.println(v);
        String w=s.replace('a','W');
        System.out.println(w);
        System.out.println(s.startsWith("java",3));
        System.out.println(s.endsWith("Me   "));
        System.out.println(s.charAt(10));
        System.out.println(s.indexOf(".",10));

        System.out.println(s.compareTo(x));
        System.out.println(s.compareToIgnoreCase(x));
    }
}