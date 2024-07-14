public class AustralianTraffic implements CentralTraffic
{

    @Override
    public void red() {
        System.out.println("red");
    }

    @Override
    public void Green() {
        System.out.println("green");

    }

    @Override
    public void Yellow() {
        System.out.println("Yellow");

    }

    public static void main(String[] args)
    {
        AustralianTraffic at=new AustralianTraffic();
        at.Green();
        at.red();
        at.Yellow();
    }
}
