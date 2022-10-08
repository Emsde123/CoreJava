package module6.Lesson3;

public class Employees {

	public int employeeID;
	public String name;
	public double salary;
	public String status;
	
	
	public Employees(){
		System.out.println("New employee created");
	}
	
	public Employees(int employeeID, String name, String status, double salary){
		
		this();
		this.employeeID = employeeID;
		this.name = name;
		this.status = status;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("-----------------------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Salary: $" + salary);
		System.out.println("Status: " + status);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("-----------------------------------------------");
	}
	
	
	
}
