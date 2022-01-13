import java.lang.*;
import java.util.*;
class areaOfTriangleUsingHeronsFormulae
{
    static public void main(String args[])
    {
        float s;
        double area;
        float s1,s2,s3;
        System.out.println("Enter the 3 sides of the triangle");
        Scanner side=new Scanner(System.in);
        s1=side.nextFloat();
        s2=side.nextFloat();
        s3=side.nextFloat();
        s=(s1+s2+s3)/2;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println(area);

    }
}