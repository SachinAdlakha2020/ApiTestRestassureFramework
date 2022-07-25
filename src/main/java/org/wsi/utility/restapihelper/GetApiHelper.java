package org.wsi.utility.restapihelper;

import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;

public class GetApiHelper {


    //Given
    public void getRequest() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com/");
        request.basePath("auth");
        request.contentType(ContentType.JSON);
        request.accept(ContentType.JSON);
        //Generate the payload
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("username", "admin");
        payload.put("password", "password123");

        request.body(payload);
        request.log().all();

        //When
        Response response = request.when().post();

        //then
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.assertThat().statusCode(HttpStatus.SC_OK);
        System.out.println("Status code is invalid");
        validatableResponse.assertThat().contentType(ContentType.JSON);
        System.out.println("Content type is invalid");
    }
}
