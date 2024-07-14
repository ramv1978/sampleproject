package StoresAPI;

import io.restassured.path.json.JsonPath;
//1. Print No of courses returned by API
// 2.Print Purchase Amount
// 3. Print Title of the first course
// 4. Print All course titles and their respective Prices
// 5. Print no of copies sold by RPA Course
// 6. Verify if Sum of all Course prices matches with Purchase Amount

public class ComplexJsonParse
{
    public static void main(String[] args) {
        JsonPath js = new JsonPath(payload.CoursePrice());
       int count = js.getInt("courses.size()");
        System.out.println(count);
        int amount = js.getInt("dashboard.purchaseAmount");
        System.out.println(amount);
        //Print Title of the first course
        String titleFirstCourse=js.get("courses[0].title");
        System.out.println(titleFirstCourse);
        //Print All course titles and their respective Prices

        for(int i=0;i<count;i++)
        {
            String courseTitles=js.get("courses["+i+"].title");
            System.out.println(js.get("courses["+i+"].price").toString());
            System.out.println(courseTitles);
        }

        //Print no of copies sold by RPA Course
        System.out.println("Print no of copies sold by RPA Course");
        for(int i=0;i<count;i++)
        {
            String courseTitles=js.get("courses["+i+"].title");
            if(courseTitles.equalsIgnoreCase("RPA"))
            {
                int copies=js.get("courses["+i+"].copies");
                System.out.println(copies);
                break;
            }
}}}
