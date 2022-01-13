import java.util.*;
import java.lang.*;
class oldYoung
{
    public static void main(String args[])
    {
        System.out.println("Enter the age of the person");
        Scanner ag=new Scanner(System.in);
        int age;
        age=ag.nextInt();
        if(age>0 && age<18)
        {
            System.out.println("The Person Is A Minor");
        }
        else if(age>18 && age<60)
        {
            System.out.println("The Person Is An Adult");
        }
        else if(age>60)
        {
            System.out.println("The Person Is A Senior Citizen");
        }
    }
}