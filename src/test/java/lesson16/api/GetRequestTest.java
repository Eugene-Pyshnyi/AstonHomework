package lesson16.api;

import lesson16.Specifications;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

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
                .and().body("args.foo2", is("bar2"));
    }
}
