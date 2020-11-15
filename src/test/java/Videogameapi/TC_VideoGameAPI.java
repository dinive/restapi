package Videogameapi;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC_VideoGameAPI {
	
	@Test
	public void test_getvideogames()
	
	{
		ResponseBody res=
		given()
		.when().get("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200).log().body().extract().response();
		String jsonString=res.asString();
		
System.out.println("is"+res);
	}
	

}
