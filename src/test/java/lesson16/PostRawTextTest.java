package lesson16;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostRawTextTest {
    @Test
    void postRawText() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .contentType(ContentType.TEXT)
                .body("{\n    \"test\": \"value\"\n}")
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("args", anEmptyMap())
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"))
                .body("files", anEmptyMap())
                .body("form", anEmptyMap())
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
