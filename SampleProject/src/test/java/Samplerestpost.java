import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Samplerestpost
{
    @Test
    public void postit()
    {
        RestAssured.baseURI = "https://reqres.in/api/unknown";
        String getResponse=	given().log().all().body("{ \"username\": \"ramv030578\", \"password\": \"Sairamnew@03051978\" }").when().post("https://reqres.in/api/unknown")
                .then().assertThat().log().all().statusCode(201).extract().response().asString();
    }
}

