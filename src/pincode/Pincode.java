package pincode;

import java.util.regex.*;

/**
 * @author Swasthik
 * Class that checks for valid Pincode number
 */
public class Pincode {

	public static void main(String[] args) {
		
		String pin = "400088";
		
		//Pattern that accepts 6 digit number starting from a non zero number
		String pattern = "[1-9]{1}[0-9]{5}";
		
		System.out.println(Pattern.matches(pattern, pin));
	}

}
