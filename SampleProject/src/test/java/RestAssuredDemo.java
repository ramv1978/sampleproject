import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDemo
{
       @Test
        public static void setup()
    {
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        // Create a request specification
        RequestSpecification requestSpecification = RestAssured.given();

        // Calling GET method
        Response response = requestSpecification.get();

        // Let's print response body.
        String resString = response.prettyPrint();
        System.out.println("Response Details : " + resString);

        /*
         * To perform validation on response, we need to get ValidatableResponse type of
         * response
         */
        ValidatableResponse validatableResponse = response.then();

        // Get status code
        System.out.println("Status code 200 is validated " + validatableResponse.statusCode(200));

        // Check status line is as expected
        validatableResponse.statusLine("HTTP/1.1 200 OK");
    }
    }

