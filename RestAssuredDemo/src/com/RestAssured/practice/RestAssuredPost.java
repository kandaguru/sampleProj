package com.RestAssured.practice;
import static io.restassured.RestAssured.given;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredPost {

public void TesterTwo(){
	
	
RestAssured.baseURI="";

String param1="";
String value1="";

String postdata="";

String resources="";



Response res=given().queryParam(param1,value1).body(postdata).
when().post(resources).
then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();

String resStr=res.asString();






}

}