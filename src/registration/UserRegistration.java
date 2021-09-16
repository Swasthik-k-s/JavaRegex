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
		
		String firstNamePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";	
		String firstName;
		
		System.out.println("Enter the First Name");
		firstName = scanner.nextLine();
		System.out.println(firstName + " - " + Pattern.matches(firstNamePattern, firstName));
		scanner.close();
	}

}
