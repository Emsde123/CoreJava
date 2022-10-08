package tutoring.group3;

public class Child {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.teacher = "TY";
		System.out.println(p.teacher);

		// name is a private variable, below I'm interacting with my setter method
		p.setName("danny");
		// Here's me printing my getter method.
		System.out.println(p.getName());
	}

}
