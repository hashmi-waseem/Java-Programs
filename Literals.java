import java.lang.*;
import java.util.*;
class Literals
{
    public static void main(String arg[])
    {
        byte b=10;          //Normal Declaration Of 10
        byte b1=0b1010;     //Binary Declaration Of 10
        byte b2=012;        //Octal Declaration Of 10
        byte b3=0XA;        //HexaDecimal Declaration Of 10
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}