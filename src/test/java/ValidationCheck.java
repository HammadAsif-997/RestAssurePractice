import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class ValidationCheck {
    @Test
    public void getReq(){
        baseURI = "https://reqres.in";
        given().get("/api/users?page=2")
                .then()
                    .assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
                    .statusCode(200)
                    .log().all();


    }
}
