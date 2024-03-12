package com.mavenproject;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclicl123").header("Content-Type","application/json")
        .body(payload.AddPlace()).when().post("maps/api/place/add/json").then().log().all().assertThat().
                statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.52 (Ubuntu)");
        System.out.println( "Hello World!" );
    }
}
