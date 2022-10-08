package tutoring.group3;

public class Parent {

	private static String name = "Yoll Academy";
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Parent.name = name;
	}


	 String teacher = "J";
	
	
	public static void main(String[] args) {

		System.out.println(name);
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		p1.teacher = "Lily";
		System.out.println("p1 teacher name: " + p1.teacher);
		p2.teacher = "Elnar";
		System.out.println("p2 teacher changed to \"Elnar\"");
		System.out.println("p2 teacher name: " + p2.teacher);
		System.out.println("p1 teacher name: " + p1.teacher);
		
		

	}

}
