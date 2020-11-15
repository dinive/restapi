package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Weather {
	
	
	@Test
	 void getweatherDetails()
	 {
	  //Specify base URI
	  RestAssured.baseURI="http://localhost:8080/app/videogames";
	  System.out.println("success");
	  
	 }
	  
	}



