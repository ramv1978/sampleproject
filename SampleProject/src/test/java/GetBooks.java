import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class GetBooks {
    @Test
    public void getData() throws IOException {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        String response = given().log().all().get().then().assertThat().statusCode(200).log().all().extract().asString();
        System.out.println("Response is" + response);
        JsonPath js1= new JsonPath(response);
        String isbn =js1.getString("books[0].isbn\n");
        System.out.println("Actual isbn is" + isbn);
        Assert.assertEquals(isbn, "9781449325862","Records not matching");
    }
}
