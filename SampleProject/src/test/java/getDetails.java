import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class getDetails
{
    @Test
    public void getData()
    {
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        String getResponse=	given().log().all().when().get("https://reqres.in/api/users?page=2")
        .then().assertThat().log().all().statusCode(200).extract().response().asString();
        }}
