package module5.Lesson5;

import module5.Lesson4.Car;

public class Demo {

	public static void main(String[] args) {
		
//		Student student1 = new Student();
//		student1.firstName = "Shabnam";
//	//	student1.schoolName = "Yoll Academy";
//		
//		
//		Student student2 = new Student();
//		student2.firstName = "Javid";
//	//	student2.schoolName = "Yoll Academy";
//		
//		Student student3 = new Student();
//		student3.firstName = "Seyla";
		
		
//		// IMPORTANT
//		// Below we tried changing schoolName to Yoll for student3. 
//		// What actually happened was it changed every student's schoolName to Yoll
//		// This is because schoolName is a STATIC variable, so if it's reassigned then each object will take that value.
//		// if I uncomment the below line it WILL NOT run, this is because we added a final modifier to the static variable.
//		// student3.schoolName = "Yoll"; 
//		
//		
//		// We commented out the hard coded .schoolName and made schoolName a static variable in the Student class.
//		// This allows us to speed up the process, without having to input data that will remain the same no mater what.
//		// The static variables can be accessed by object name
//		// There's an underline beneath SCHOOL_NAME because it's a static variable, you can access it with className.staticVariable
		
		
//		System.out.println("Student's school name is: " + student1.SCHOOL_NAME);
//		System.out.println("Student's school name is: " + student2.SCHOOL_NAME);
//		
//		// Also static variables are accessible by className
//		System.out.println("School name: " + Student.SCHOOL_NAME);
//		
//		
//		System.out.println(Car.minNumOfSeats);
//		Car.minNumOfSeats = 1;
//		System.out.println(Car.minNumOfSeats);
//		

		
		// Static methods can be called by objects
		
		AccountUtils ac = new AccountUtils();
		
//	String domain =	ac.getDomain("daniel@yoll.com");
//		System.out.println(domain);
//		
//	String emailID = ac.getEmailID("dima@yoll.com");
//		System.out.println(emailID);
//		
//	String username = ac.generateUsername(emailID);
//	System.out.println(username);
//		
		// Also static methods can be called by ClassName.methodName();
		String email = "Omar@email.com";
		
		System.out.println(AccountUtils.getDomain(email));
		System.out.println(AccountUtils.getEmailID(email));
		System.out.println(AccountUtils.generateUsername("omar"));
		
		
		// INSTANCE METHODS REQUIRE A NEW OBJECT TO BE MADE FROM THE CLASS
		Student student6 = new Student(); 
		student6.instanceMethod();
		
		
		// We can call a non-static method by creating an object first, and then calling the method. 
		// Above example is the same
		Student st1 = new Student();
		st1.getFullName();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
