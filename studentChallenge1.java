import java.lang.*;
import java.util.*;
class studentChallenge1
{
    public static void main(String args[])
    {
        String s="W.a.se.e.m@ &*Hashmi";
        System.out.println(s.replaceAll("[^a-z A-Z 0-9]",""));

        String t="        W a      se      e m           ";
        System.out.println(t.replaceAll("\\s+"," ").trim());

        String u="Waseem    Is           A Good              Boy                ";
        String u1=u.replaceAll("\\s+"," ").trim();
        System.out.println(u1);
    }
}