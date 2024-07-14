package StoresAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestAssuredAddPlace
{
    public static void main(String[] args){
    {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().body(payload.AddPlace())
                .when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
                .body("status", equalTo("OK")).extract().response().asString();

        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String placeid;
        placeid = js.getString("place_id");
        System.out.println(placeid);
        //Update Place
        String newAddress = "winter walk, america";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body("{\r\n" +
                        "\"place_id\":\""+placeid+"\",\r\n" +
                        "\"address\":\""+newAddress+"\",\r\n" +
                        "\"key\":\"qaclick123\"\r\n" +
                        "}").
                when().put("maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
        String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id",placeid)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath js1=new JsonPath(getPlaceResponse);;
        String actualAddress =js1.getString("address");
        System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, "winter walk, america");
}}}
