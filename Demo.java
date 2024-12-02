import java.util.Scanner;
class WrongAge extends Exception
{
    public WrongAge()
 {
        System.out.println("Age Error");
 }

    public WrongAge(String message)
 {
        System.out.println(message);
 }
}
class Father
 {
    protected int fage;
    public Father() throws WrongAge
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Father's age: ");
    fage = scanner.nextInt();
    if (fage < 0)
        {
            throw new WrongAge("Father's age cannot be negative");
        }
    }
    public void display()
    {
        System.out.println("Father's Age: " + fage);
    }
}
class Son extends Father{
    private int sonage;
    public Son() throws WrongAge
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Son's age: ");
        sonage = scanner.nextInt();
        if (sonage >= fage)
        {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
       else if (sonage < 0)
        {
            throw new WrongAge("Son's age cannot be negative");
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Son's Age: " + sonage);
    }
}
public class Demo
 {
    public static void main(String args[])
     {
        System.out.println("K Aishwarya 1BM23CS129");
        try
        {
            Son s=new Son();
           
            s.display();
        }
        catch (WrongAge e)
        {
            System.out.println("Exception Caught");
        }
    }
}

