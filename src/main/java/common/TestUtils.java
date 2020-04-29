package common;

import org.apache.commons.lang3.RandomStringUtils;

public class TestUtils {
	
	
	
	public static String getFirstName() {
		String randomString = RandomStringUtils.randomAlphabetic(6);
		return( "FirstName"+randomString);
	}
	
	public static String getLastName() {
		String randomString = RandomStringUtils.randomAlphabetic(6);
		return( "LastName"+randomString);
	}
	
	public static String getUserName() {
		String randomString = RandomStringUtils.randomAlphabetic(6);
		return( "UserName"+randomString);
	}
	
	public static String getEmail() {
		String randomString = RandomStringUtils.randomAlphabetic(15);
		return( randomString+"@gmail.com");
	}
	
	
	public static String getPassword() {
		String randomString = RandomStringUtils.randomAlphabetic(6);
		return( "Password"+randomString);
	}

	public static String getSalary() {
		String randomString = RandomStringUtils.randomNumeric(5);
		return( randomString);
	
	}
}
