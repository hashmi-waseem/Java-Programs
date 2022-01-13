import java.lang.*;
import java.util.*;
class storing2VariablesInOneVariable
{
    public static void main(String args[])
    {
        int a=8; int b=12; int c;
        c=a;
        b=b<<4;
        c=c|b;
        System.out.println("The First 4 Digits Are:" + (c&0b00001111));
        System.out.println("The Last 4 Digits Are:" + ((c&0b11110000)>>4));
    }
}