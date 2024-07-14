import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class RestAssuredGet
{
    @Test
    public void getData() throws IOException{
        RestAssured.baseURI= "https://reqres.in/api/users?page=2";
        String response = given().log().all().get().then().assertThat().statusCode(200).log().all().extract().asString();
        System.out.println("Response is" + response);

}
}
