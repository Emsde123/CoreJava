package module6;

public class Account { // Class can not have a private access modifier

	private String username;
	// Private access modifier will not allow any other classes to interact/access with the variables
	private String password;
	
	// For private fields, we can create getters and setters.
	// Think of them as a bridge that can allow you to access private access modifiers.
	
	
	//                              THIS KEYWORD
	// We will use the THIS keyword below, think of it as a pointer to tell Java which variable is the instance variable
	// THIS keyword will tell Java which variable is part of the object/class.
	// Using THIS, we will take a value in the method, and then set that value as the private instance variable's value.
	// This allows us to interact with private AMs without directly changing the value.
	// Think about THIS like a pointer to tell Java what to look at.
	// THIS object
	
	// SETTERS - Set the value for private fields
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	// GETTERS
	// Getters allow you to get the value from private fields.
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
}
