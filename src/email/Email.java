package email;

import java.util.regex.*;

public class Email {

	public static void main(String[] args) {
		
		String pattern = "[a-zA-Z][0-9a-zA-Z]*([.\\-_+][0-9a-zA-Z]+)?\\@[0-9a-zA-Z]+\\.[a-zA-Z]+([.][a-z]{2})?";
		
		String email = "abc.xyz@bridgelabz.com.in";
		
		System.out.println(email + " is " + (Pattern.matches(pattern, email)?"Valid":"Invalid"));
	}
}
