package tutoring.group3;

import java.util.Scanner;

public class ArrayListMethods {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
		
	//	System.out.println(doublePhrase(input));

		System.out.println(isLowerCase("isitlowercase"));
		
		String[] arr = new String[] {"today", "we", "went", "outside"};
		
		
		
	}

	public static boolean isLowerCase(String phrase) {
		
		return (phrase.equals(phrase.toLowerCase()));
		
		
	}
	
	
	
	
	public static String doublePhrase(String phrase) {
		
		String repeated = phrase + " " + phrase;
		
		return repeated;
	}
}
