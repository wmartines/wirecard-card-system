package de.com.wirecard.util;

import java.util.Random;

public class WireCardUtils {
	
	private static Random random = new Random();
	
	public static String generateCardNumber() {
		
		String fullCardNumber = null;
		
		Integer cardNumberFirstDigits = random.nextInt(900000000) + 900000000;
		Integer cardNumberLastDigits = random.nextInt(900000000) + 900000000;
		fullCardNumber = cardNumberFirstDigits.toString().concat(cardNumberLastDigits.toString());
		
		return fullCardNumber;
	}

}
