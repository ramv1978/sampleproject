import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredPost
{
    @Test
    public void postDetails()
    {
        Response response = given().header("Content-type", "application/json")
                .and().body("{\n" +
                        "    \"name\": \"moses\",\n" +
                        "    \"job\": \"Copier\"\n" +
                        "}")
                .when().post("https://reqres.in/api/users")
                .then()
                .extract().response();

        System.out.println("Response is " + response.asPrettyString());
        System.out.println(response.jsonPath().getString("name"));
        System.out.println(response.jsonPath().getString("job"));
        Assert.assertEquals("moses", response.jsonPath().getString("name"));
        Assert.assertEquals("Copier", response.jsonPath().getString("job"));
    }
}
