import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class PostBooks {
    @Test
    public void PostData() throws IOException {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Books";
        String response = given().log().all().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic cmFtdjAzMDUxOTc4ODpTYWlyYW1AMDMwNTE5Nzg4").body("{\n" +
                        "  \"userId\": \"b317ce97-8d61-455d-a33f-1d24bd38b183\",\n" +
                        "  \"collectionOfIsbns\": [\n" +
                        "    {\n" +
                        "      \"isbn\": \"9781449337711\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}")
                .when().post().then().assertThat().statusCode(201).log().all().extract().asString();
        System.out.println("Response is" + response);
    }
}
