package lesson16.api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lesson16.Specifications;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRawTextTest {
    @Test
    void postRawText() {
        Specifications.installSpecs(Specifications.requestSpec(), Specifications.responseSpec200());

        String expectedData = "This is expected to be sent back as part of response body.";

        Response response = given()
                .when()
                .body(expectedData)
                .post("post");

        response.then().log().all();

        JsonPath jsonPath = response.jsonPath();

        Assert.assertTrue(jsonPath.getMap("args").isEmpty(), "args must be empty");
        Assert.assertEquals(jsonPath.getString("data"), "This is expected to be sent back as part of response body.", "Different actual data");
        Assert.assertTrue(jsonPath.getMap("files").isEmpty(), "files must be empty");
        Assert.assertTrue(jsonPath.getMap("form").isEmpty(), "form must be empty");
        Assert.assertNull(jsonPath.get("json"), "json must be null");
        Assert.assertEquals(jsonPath.getString("url"), "https://postman-echo.com/post", "Different URL");
        Assert.assertNotNull(jsonPath.getMap("headers"), "Headers must not be null");
    }
}
