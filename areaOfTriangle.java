import java.lang.*;
import java.util.*;
class areaOfTriangle
{
    static public void main(String args[])
    {
        float height, base;
        System.out.println("Enter the height of the triangle");
        Scanner t=new Scanner(System.in);
        height=t.nextFloat();
        System.out.println("Enter the base of the triangle");
        base=t.nextFloat();
        System.out.println((base*height)/2);
    }
}