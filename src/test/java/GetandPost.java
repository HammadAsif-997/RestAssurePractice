import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetandPost {

    @Test
    public void getReq(){
        baseURI = "https://reqres.in";
        given().get("/api/users?page=2")
                .then().statusCode(200)
                .body("data[1].first_name",equalTo("Lindsay"))
                .body("data.first_name",hasItems("Michael","Tobias"))
                .log().all();
    }

    @Test
    public void postReq() {

        JSONObject request = new JSONObject();

        request.put("hammad","leader");
        request.put("Adil","manager");
        System.out.println(request.toJSONString());
        System.out.println(request);

        baseURI = "https://reqres.in";
        given().
                header("Content-Type", "application/json").
                body(request.toJSONString())
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .log().all();

    }
}
