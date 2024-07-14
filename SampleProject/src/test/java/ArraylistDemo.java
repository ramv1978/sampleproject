import java.util.ArrayList;

public class ArraylistDemo
{
    public static void main(String[] args)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("Ram");
        arraylist.add("Rahul");
        arraylist.add("Ram");
        arraylist.add("123");
        arraylist.add("");
        arraylist.add("Raghu");
        System.out.println(arraylist.remove(4));
        System.out.println(arraylist.get(1)); // O(1) access to individual element
        System.out.println(arraylist.contains("Ram"));
        System.out.println(arraylist.indexOf("Rahul"));
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.size());
    }
}
