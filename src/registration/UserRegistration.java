package registration;

import java.util.regex.*;
import java.util.*;

/**
 * @author Swasthik
 * User Registration form Validation using Java Regex
 */
public class UserRegistration {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Patterns for Fields
		String firstNamePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";	
		String lastNamePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";	
		
		String firstName;
		String lastName;
		
		//Ask User for Input
		System.out.println("Enter the First Name");
		firstName = scanner.nextLine();
		System.out.println("Enter the Last Name");
		lastName = scanner.nextLine();
		
		//Validate all the fields entered by the User
		System.out.println("First Name " + " is " + (Pattern.matches(firstNamePattern, firstName)?"Valid":"Invalid"));
		System.out.println("Last Name " + " is " + (Pattern.matches(firstNamePattern, lastName)?"Valid":"Invalid"));
		scanner.close();
	}

}
