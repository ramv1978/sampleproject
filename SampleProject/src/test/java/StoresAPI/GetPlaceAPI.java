package StoresAPI;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetPlaceAPI
{
    @Test
            public void GetPlaces()
    {
        String URL = RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().when().get("/maps/api/place/get/json?place_id=df380058d584764697af5082c38336b8&key=qaclick123").
                then().assertThat().log().all().statusCode(200).body("address",equalTo("49, side layout, cohen 10"))
                .body("types",equalTo("shoe park,shop")).header("Server",equalTo("Apache/2.4.52 (Ubuntu)"))
                .extract().response().asString();
    }
}
