package lesson16.api;

import lesson16.Specifications;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequestTest {
    @Test
    void getRequest() {
        Specifications.installSpecs(Specifications.requestSpec(), Specifications.responseSpec200());
        given()
                .when()
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().body() //На всякий случай вывожу в консоль тело ответа
                .assertThat()
                .body("args.foo1", is("bar1"))
                .and().body("args.foo2", is("bar2"))
                .and().body("headers.host", is("postman-echo.com"))
                .and().body("headers.x-request-start", instanceOf(String.class))
                .and().body("headers.x-forwarded-proto", is("https"))
                .and().body("headers.x-amzn-trace-id", instanceOf(String.class))
                .and().body("headers.user-agent", instanceOf(String.class))
                .and().body("headers.accept", is("*/*"))
                .and().body("headers.accept-encoding", instanceOf(String.class))
                .and().body("url", is("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }
}
