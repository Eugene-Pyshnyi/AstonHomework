package lesson16.api;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostFormDataTest {
    @Test
    void postFromData() {
        given()
                .when()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1", "bar1")
                .and().formParam("foo2", "bar2")
                .post("/post")
                .then()
                .assertThat()
                .log().all()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .and().body("form.foo2", equalTo("bar2"));
    }
}
