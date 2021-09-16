package pincode;

import java.util.regex.*;

/**
 * @author Swasthik
 * Class that checks for valid Pincode number
 */
public class Pincode {

	public static void main(String[] args) {
		
		//Pincode test samples
		String pin1 = "400088";
		String pin2 = "A400088";
		String pin3 = "400088B";
		String pin4 = "400 088";
		
		//Pattern that accepts 6 digit number starting from a non zero number
		String pattern = "[1-9]{1}[0-9]{2}\\s?[0-9]{3}";
		
		//Check pincode sample with pattern and print result
		System.out.println(pin1 + " - " + Pattern.matches(pattern, pin1));
		System.out.println(pin2 + " - " + Pattern.matches(pattern, pin2));
		System.out.println(pin3 + " - " + Pattern.matches(pattern, pin3));
		System.out.println(pin4 + " - " + Pattern.matches(pattern, pin4));
	}

}
