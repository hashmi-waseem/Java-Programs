import java.lang.*;
import java.util.*;
class Variables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte b;
        b=sc.nextByte();
        System.out.println(b);

        int i;
        char c='W';
        float f;
        System.out.println("Enter Integer And Float Values");
        i=sc.nextInt();
        f=sc.nextFloat();
        System.out.println(i + f + b);
    }
}