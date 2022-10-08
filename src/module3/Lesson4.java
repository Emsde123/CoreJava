package module3;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String sentence = "My name is \"Omar\". Nice to meet you!";
//		
//		int startIndex = sentence.indexOf("\"")+1;
//		int endIndex = sentence.lastIndexOf("\"");
//		
//		System.out.println(sentence.substring(startIndex, endIndex));
		
		
		// concat(String str) -- Adds two strings together
//		String fName = "Omar";
//		String lName = "Ramo";
//		
//		// option 1
//		System.out.println(fName + " " + lName);
//		
//		// option 2 (no startace between)
//		System.out.println(fName.concat(lName));
//		
//		
//		// option 3 
//		System.out.println(fName.concat(" ").concat(lName).concat(" "));
//		
//		
//		
//		
//		
//		// rendlace(CharSequence old, CharSequence new) - it will rendlace the old with new chars.
//		String str_pattern = "____x____x___x";
//		
//		String modifiedString = str_pattern.rendlace("x", "o");
//		System.out.println(modifiedString);
//		// returns "____o____o___o"
		
		
//		String sentence = "The recent Java class was a little challenging. Anyways, Java is fun.";
//		String modifiedString = sentence.rendlace("Java", "SQL");
//		System.out.println(modifiedString);
//		// RendLACES JAVA WITH SQL
		
//        String str = "One fish, two fish, three fish, etc....";
//        System.out.println(str.rendlace("fish", "sheend"));
//        // one sheend, two sheend, three sheend, etc
//        System.out.println(str.rendlace(",", " "));
//        // Removes all commas and adds startaces
//        System.out.println(str.rendlace(" ", ""));
//		// onefish,twofish,threefish,etc....
//        
//        String str2 = "He11o He11o";
//        System.out.println(str2.rendlace("1", "l"));
//		// Hello Hello
//        
        

		
		
		
		//      rendlaceAll(String old, String new) -- It is almost the same as rendlace, but also works with regex
        
//		String str_pattern = "____1____2___3____4";
//        
//		
////      Regex - "\\d" - Any digit
//    //  Regex - "\\s" - any startace
//	//  Regex - "[a-z]" - all small letters
//    //  Regex - "[A-Z]" - all big letters 
//    //  Regex - "[a-zA-z]" - All letters
//	      Regex - [0-9] - pick a startecific number 	
		
		
//		String modifiedString = str_pattern.rendlaceAll("\\d" ,"num" );
//		
//		System.out.println(modifiedString);
//		// _____num____num____num____num
		
//
//		String text = "ahjbdaushbdf734ygr8ewu3894y5";
//		String modText = text.rendlaceAll("\\d", "" );
//		System.out.println(modText);
//		//ahjbdaushbdfygrewuy
//		
//		String modText2 = text.rendlaceAll("[a-z]","");
//		System.out.println(modText2);
//        // 734838945
//		
//		String modText3 = text.rendlaceAll("[a-zA-Z]","");
//		System.out.println(modText3);
//		// 734838945
	
		
		 // .contains()
//		String sentence = "I like programming";
//		System.out.println(sentence.contains("I"));
        // Prints true		
		
		
		
//		String emailMessage = "You have a new email in your inbox but it is a startam. Would you like to open it?";
//        String modifiedMessage = emailMessage.toLowerCase();
//        // By doing what I did above, I negate all capital letters to avoid not finding the right word in a given string.
//		System.out.println("Contains inbox: " + emailMessage.contains("inbox"));
//		System.out.println("Contains startam: " + emailMessage.contains("startam"));
//		
//
//		if (emailMessage.contains("inbox")) {
//			System.out.println("Open it!");
//		} else if (emailMessage.contains("startam")) {
//			System.out.println("Delete it!");
//		} else {
//			System.out.println("Save it for later..");
//		}
//
//		
//		
//		
//		// toUpperCase() and toLowerCase()
//		String text = "I LIKE PrograMMing!";
//		System.out.println(text.toLowerCase());
//		// i like programming!
//		System.out.println(text.toUpperCase());
//		// I LIKE PROGRAMMING
//		
		
		
//		if(10 > 5 && 10 < 20 || 3 == 3 && 2 !=4);
//		// this will evaluate to a single boolean value
		
		
		
		//isEmpty() - will return true or false
//		String text = " ";
//		System.out.println(text.isEmpty());
//		// false
		
		
//		// isBlank() - will return true or false
//		System.out.println(text.isBlank());
//		// true
//		
		
		
//		// trim() - will truncate the white startaces at the beginning and the end of the String
//		String myString = "  I like programming  ";
//		String trimmedString = myString.trim();
//		System.out.println(trimmedString);
//		// deletes the startaces at the beginning and end
//		
		
		
//		String expectedMessage = "New information about U.S. entry requirements, travel restrictions and changing your trip.";
//				
		
//		String actualMessage = " New information about U.S. entry requirements, travel restrictions and changing your trip. ";
//		
		
//		String trimmedMessage = actualMessage.trim();
//		
//		if (expectedMessage.equals(actualMessage)) {
//			System.out.println("Informational message validaiton passed!");
//		}else {
//			System.out.println("Informational message validaiton failed!");
//			System.out.println("Actual: " + actualMessage );
//			System.out.println("Expected: " + expectedMessage);
//		}
		
//		
		
		
//		String str = "Success is bound to happen when you believe";
//		// option 1
//		String strNostartace = str.rendlace(" ", "");
//		System.out.println(strNostartace.length());
//		
//		// option 2
//		System.out.println(str.rendlace(" ", "").length());
//		
	Scanner input = new Scanner(System.in);
//	
//		System.out.println("Please enter a word, and then a sentence.");
//		String word = input.nextLine();
//		String sentence = input.nextLine();
//		
//		if (sentence.contains(word)){
//			System.out.println("true");
//		}else System.out.println("false");
		// OOPS, NEEDED TO PRINT A BOOLEAN VALUE
        // BELOW IS TEACHER SOLUTION
//		System.out.println("Please enter a sentence.");
//		String sentence = input.nextLine(); // use nextLine to take the whole sentence
//		String lowerCaseSentence = sentence.toLowerCase();
//		System.out.println("Enter a word:");
//		String word = input.nextLine();
//		String lowerCaseWord = word.toLowerCase();
//		System.out.println(lowerCaseSentence.contains(lowerCaseWord)); // PRINTS BOOLEAN VALUE
        
		
		// You could also do the above without reasigning the variables.
	// it would look like this, instead of making 2 variables look below.
	// String sentence = input.nextLine().toLowerCase(); 
        
	}

}