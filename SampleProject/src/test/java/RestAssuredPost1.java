import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class RestAssuredPost1 {
    @Test
    public void PostData() throws IOException {
        RestAssured.baseURI = "https://reqres.in/api/unknown";
        String response = given().log().all().body("{ \"username\": \"ramv030578\", \"password\": \"Sairamnew@03051978\" }")
                .when().post().then().assertThat().statusCode(201).log().all().extract().asString();
        System.out.println("Response is" + response);
    }
}