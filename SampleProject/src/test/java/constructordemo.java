public class constructordemo
{
    public void getmethod()
    {
        System.out.println("In method");
    }
    public constructordemo()
    {
        System.out.println("Im in constructor");
    }

    public static void main(String[] args)
    {
        constructordemo cd1 = new constructordemo();
        cd1.getmethod();
    }
}
