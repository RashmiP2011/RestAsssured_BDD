package restassuredTests;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.TestUtils;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo2_POST_Request {
	
	
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeTest
	public void generatedata()
	{
		map.put("FirstName",TestUtils.getFirstName());
		map.put("LastName",TestUtils.getLastName());
		map.put("UserName",TestUtils.getUserName());
		map.put("Password",TestUtils.getPassword());
		map.put("Email",TestUtils.getEmail());
			

	}

	
	@Test
	public void postUser()
	{
		System.out.println(map);
	given()
		.contentType("application/json")
		.body(map)
	.when()
		.post("http://restapi.demoqa.com/customer/register")
	.then()
		.statusCode(201)
	.and()
		.statusLine("HTTP/1.1 201 Created")
	.and()
	    .assertThat().body("SuccessCode", equalTo("OPERATION_SUCCESS"))
	.and()
	    .assertThat().body("Message", equalTo("Operation completed successfully"));
	}



}
