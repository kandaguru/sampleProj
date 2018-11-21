package com.RestAssured.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.jsoup.select.Evaluator.ContainsText;

public class RestAssuredOne {
	
	

	@Test
	public  void testerMethod() {

		RestAssured.baseURI = "https://www.metaweather.com";

		Response res= given().param("query","san").
		when().get("/api/location/search/").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		//body("array[1].location_type",equalTo("City")).
		header("Server", "Google Frontend").
		extract().response();

		String responseString=res.asString();
		System.out.println(responseString);
	}

}
