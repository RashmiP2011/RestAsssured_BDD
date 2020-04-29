package restassuredTests;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Demo4_DELETE_Request {
	
	int empid= 24;
	
	@Test
	public void deleteUser()
	{
		
		
	Response response=	
			given().
	when().
		delete("http://dummy.restapiexample.com/api/v1/delete/" + empid)
	.then()
		.statusCode(200)
	.and()
		.log().all()
		.extract().response();
		
		response.asString();
	
	  
	  
	  String stringResponse = response.asString();
		
	  System.out.println(stringResponse);	
	}

}
