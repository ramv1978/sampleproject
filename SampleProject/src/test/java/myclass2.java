public class myclass2 extends Abstractdemo
{
    @Override
    public void speak() {
        System.out.println("Speak a Speako");
    }

    public void getSample()
    {
        System.out.println("Same abstract class method");
    }

    public static void main(String[] args) {
        myclass2 my2 = new myclass2();
        my2.getSample();
        my2.speak();
    }

}
