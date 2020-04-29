package restassuredTests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.TestUtils;

public class Demo3_PUT_Request {

	public static HashMap<String, String> map = new HashMap<String, String>();
	int empid =23;
	
	@BeforeTest
	public void generatedata()
	{
		map.put("name",TestUtils.getFirstName());
		map.put("salary",TestUtils.getSalary());
	}
	

	
	@Test
	public void putUser()
	{
		
		System.out.println(map);
	given()
		.contentType("application/json")
		.body(map)
	.when()
		.put("http://dummy.restapiexample.com/api/v1/update/"+ empid)
	.then()
		.statusCode(200)
	.and()
		.statusLine("HTTP/1.1 200 OK")
		.log().all();
	}


}
