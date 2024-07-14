public class FirstClass
{
    public void getdata()
    {
        System.out.println("We are in first method");
    }
    public static void main(String[] args)
    {
        FirstClass fc1 = new FirstClass();
        SecondClass sc1 = new SecondClass();
        sc1.second();
        fc1.getdata();
        System.out.println("Hello World");
    }
}
