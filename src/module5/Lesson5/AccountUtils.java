package module5.Lesson5;

import java.util.Random;

public class AccountUtils {
	
	
	// Method to get everything after the "@"
	public static String getDomain(String email) {
		// daniel@yoll.io
		// domain: yoll.io
		return email.substring(email.indexOf("@") + 1);
	}
	
	
	// This will get the emailID (everything before "@")
	public static String getEmailID(String email) {
		
		return email.substring(0, email.indexOf("@"));
	}
	
	
	// This will generate a random 3 digit number to add onto the end of emailID so it makes a username.
	public static String generateUsername(String emailID) {
		Random random = new Random();
	   String username = emailID + random.nextInt(100, 1000);
		return username.toLowerCase();
	}
	
	
	

}
