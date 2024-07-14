import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEgs
{
    @Test
    public void Dataset()
    {
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";

        // Create a request specification
        RequestSpecification requestSpecification = RestAssured.given();

        // Calling GET method
        Response response = requestSpecification.get();
        String b = response.asString();

        //JSON Representation from Response Body
        JsonPath json1 = response.jsonPath();
        //Get value of firstname Key
        String total = json1.get("total").toString();
        System.out.println("total is " + total);

        // Let's print response body.
        String resString = response.prettyPrint();
        System.out.println("Response Details : " + resString);

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println("Response Asserted");

        //Value assertion for total
        Assert.assertTrue(total.equalsIgnoreCase("12"));

    }

}
