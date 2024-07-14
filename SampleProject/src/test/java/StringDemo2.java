public class StringDemo2
{
    public static void main(String[] args)
    {
        String str1 = "Hello"; // string literal
        String str2 = str1; // string literal
        String str3 = str1.concat("Axis");
        System.out.println(str1.concat("Axis"));
        System.out.println(str1);
        System.out.println("Before modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        str1 += " World!";
        System.out.println("After modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        StringBuilder sb = new StringBuilder("Hello");// String builder to make it mutable
        System.out.println(sb.append(" World!"));//Hello World!
        System.out.println(sb);//Hello World!
        StringBuffer sbr = new StringBuffer("Hello");// String Buffer to make it mutable
        System.out.println(sbr.append(" World!"));//Hello World!
        System.out.println(sbr);

    }
}
