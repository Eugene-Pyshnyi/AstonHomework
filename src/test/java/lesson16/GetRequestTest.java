package lesson16;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequestTest {
    @Test
    void getRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.JSON)
                .when()
                .get("/get")
                .then().log().body() //На всякий случай вывожу в консоль тело ответа
                .assertThat()
                .statusCode(200)
                .body("args", anEmptyMap())
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-request-start", instanceOf(String.class))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.x-amzn-trace-id", instanceOf(String.class))
                .and().body("headers.user-agent", instanceOf(String.class))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", instanceOf(String.class))
                .and().body("url", equalTo("https://postman-echo.com/get"));
    }
}
