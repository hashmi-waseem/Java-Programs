import java.lang.*;
import java.util.*;
class incrementDecrement
{
    public static void main(String args[])
    {
        int x=5,y,z;
        y=x++;
        System.out.println("The Result Of Post Increment Is:" + y);
        z=++x;
        System.out.println("The Result Of Pre Increment Is:" + z);
    }
}