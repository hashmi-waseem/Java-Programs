import java.lang.*;
import java.util.*;
class regularExpression
{
    public static void main(String args[])
    {
        String s="waseemhashmi39@gmail.com";
        boolean a=s.matches(".*gmail.*");
        int i=s.indexOf("@");
        String username=s.substring(0,i);
        String domainname=s.substring(i+1);
        System.out.println(a);
        System.out.println("Username Is:" + username);
        System.out.println("Domain Name Is:" + domainname);
    }
}