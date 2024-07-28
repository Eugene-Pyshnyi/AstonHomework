package lesson16;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRawTextTest {
    @Test
    void postRawText() {
        given()
                .when()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.TEXT)
                .body("{\n    \"test\": \"value\"\n}")
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"));
    }
}
