import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

public class RestApi1 {

    @Test
    public void Coronavirus(){
        RestAssured.baseURI = String.format("https://api.quarantine.country/api/v1/summary/latest");
        Response response = given()
                .log().all()
                .header("Accept","application/json")
                .get();

        String body = response.getBody().asString();//Obtener el body de la petición

        System.out.println("Body response= " + body);
        System.out.println("Response status = " + response.getStatusCode());
        System.out.println("Response Headers = " + response.getHeaders());
        System.out.println("Response ContentType = " + response.contentType());
        assertEquals(200,response.getStatusCode());
        assertTrue(body.contains("summary"));
    }

    @Test
    public void t01_get_token_fail(){
        //Request an account token without authorization header
        RestAssured.baseURI = String.format("https://webapi.segundamano.mx/nga/api/v1.1/private/accounts");
        Response response = given().log().all()
                .post();
        //validations
        System.out.println("Status expected: 400" );
        System.out.println("Result: " + response.getStatusCode());
        assertEquals(400,response.getStatusCode());
        String errorCode = response.jsonPath().getString("error.code");
        System.out.println("Error Code expected: VALIDATION FAILED \nResult: " + errorCode);
        assertEquals("VALIDATION_FAILED",errorCode);
    }
}
