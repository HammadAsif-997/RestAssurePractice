import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutAndPatch {

    @Test
    public void putReq() {

        JSONObject request = new JSONObject();

        request.put("name","Hammad");
        request.put("job","manager");
        System.out.println(request.toJSONString());
        System.out.println(request);

        baseURI = "https://reqres.in";
        given().
                header("Content-Type", "application/json").
                body(request.toJSONString())
            .when()
                .put("/api/users/2")
            .then()
                .statusCode(200)
                .log().all();

    }

    @Test
    public void patchReq() {

//        JSONObject request = new JSONObject();

//        request.put("name","Hammad");
//        request.put("job","manager");
//        System.out.println(request.toJSONString());
//        System.out.println(request);

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type", "application/json")
                    .body("{\n" +
                        "    \"name\": \"Hammad\",\n" +
                        "    \"job\": \"manager\"\n" +
                        "}")
            .when()
                .patch("/api/users/2")
            .then()
                .statusCode(200)
                .log().all();

    }

    @Test
    public void deleteReq() {

        baseURI = "https://reqres.in/api";

        when()
            .delete("/api/users/2")
        .then()
            .statusCode(204)
            .log().all();

    }
}
