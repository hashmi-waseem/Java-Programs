import java.lang.*;
import java.util.*;
class Cuboid
{
    public static void main(String args[])
    {
        int length, breadth, height, area, volume;
        Scanner cb=new Scanner(System.in);
        System.out.println("Enter Length, Breadth And Height Of Cuboid In Given Order");
        length=cb.nextInt();
        breadth=cb.nextInt();
        height=cb.nextInt();
        area=2*length*breadth + 2*length*height + 2*breadth*height;
        volume=length*breadth*height;
        System.out.println("The Total Area Of The Cuboid Is:" + area);
        System.out.println("The Total Volume Of The Cuboid Is:" + volume);
    }
}