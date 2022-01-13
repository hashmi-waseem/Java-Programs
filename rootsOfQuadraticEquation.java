import java.lang.*;
import java.util.*;
class rootsOfEquation
{
    public static void main(String args[])
    {
        System.out.println("Enter The Three Coefficients");
        Scanner cf=new Scanner(System.in);
        int a,b,c;
        a=cf.nextInt();
        b=cf.nextInt();
        c=cf.nextInt();
        double root=Math.sqrt(b*b-4*a*c);
        double result1= (-b+root)/2*a;
        System.out.println("The First Root Is:" + result1);
        double result2= (-b-root)/2*a;
        System.out.println("The Second Root Is:" + result2);
        
    }
}