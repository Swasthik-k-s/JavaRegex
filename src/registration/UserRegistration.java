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
		String firstNamePattern = "[A-Z][a-zA-Z]{2,}";	
		String lastNamePattern = "[A-Z][a-zA-Z]{2,}";
		String emailPattern = "[a-zA-Z][0-9a-zA-Z]*([.\\-_+][0-9a-zA-Z]+)?\\@[0-9a-zA-Z]+\\.[a-zA-Z]+([.][a-z]{2})?";
		String phoneNumberPattern = "[1-9][0-9]\\s[1-9][0-9]{9}";
		String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}";
		
		String firstName;
		String lastName;
		String email;
		String phoneNumber;
		String password;
		
		//Ask User for Input
		System.out.println("Enter the First Name");
		firstName = scanner.nextLine();
		System.out.println("Enter the Last Name");
		lastName = scanner.nextLine();
		System.out.println("Enter the Email ID");
		email = scanner.nextLine();
		System.out.println("Enter the Phone Number");
		phoneNumber = scanner.nextLine();
		System.out.println("Enter the Password");
		password = scanner.nextLine();
		
		//Validate all the fields entered by the User
		System.out.println("First Name " + " is " + (Pattern.matches(firstNamePattern, firstName)?"Valid":"Invalid"));
		System.out.println("Last Name " + " is " + (Pattern.matches(lastNamePattern, lastName)?"Valid":"Invalid"));
		System.out.println("Email ID " + " is " + (Pattern.matches(emailPattern, email)?"Valid":"Invalid"));
		System.out.println("Phone Number " + " is " + (Pattern.matches(phoneNumberPattern, phoneNumber)?"Valid":"Invalid"));
		System.out.println("Password " + " is " + (Pattern.matches(passwordPattern, password)?"Valid":"Invalid"));
		scanner.close();
	}

}
