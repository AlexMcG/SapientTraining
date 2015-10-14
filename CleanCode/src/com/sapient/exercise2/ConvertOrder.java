package com.sapient.exercise2;

public class ConvertOrder {
	final static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven" ,"eight", "nine", };
	final static String[] nineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven" ,"eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	final static String[] twentyPlus = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	final static String[] sOrder = {"", "", "", "hundred", "thousand", "thousand", "hundred", "million"};
	
	public static void main(String[] args) {
		System.out.println(convertOrder(0));
		System.out.println(convertOrder(19));
		System.out.println(convertOrder(20));
		System.out.println(convertOrder(210));
		System.out.println(convertOrder(6396));
		System.out.println(convertOrder(15431));
		System.out.println(convertOrder(150431));
	}
	
	public static String convertOrder(int input) {
		String strAmount = "";
		String strInput = Integer.toString(input);
		int order = strInput.length();
		strAmount = buildString(strInput, order);
		return strAmount;
	}
	
	//0 0
	//1 0
	//2 0
	//3 1
	//4 2
	//5 2
	//6 2
	//7 3
	public static String buildString(String strInput, int order) {
		String strOutput = "";
		while (order > 0) {
			if (order < 2) {
				return twoDigit(strInput, Integer.parseInt(strInput));
			} else if (((order+3) % 3) < 2) {
				String sDigit = Character.toString(strInput.charAt(0));
				int iDigit = Character.getNumericValue(strInput.charAt(0));
				strOutput += (twoDigit(sDigit, iDigit) + " " + sOrder[order] + " ");
				strInput = strInput.substring(1, order);
				order--;
			} else {
				String sDigits = strInput.substring(0, 2);
				int iDigits = Integer.parseInt(sDigits);
				strOutput += (twoDigit(sDigits, iDigits) + " " + sOrder[order] + " ");
				strInput = strInput.substring(2, order);
				order -= 2;
			}
		}
		return strOutput;
	}
	
	public static String twoDigit(String strInput, int input) {
		String strOutput = "";
		if (strInput.equals("00")) {
			return strOutput;
		} else if (input < 20) {
			return nineteen[input];
		} else {
			char cFirstDigit = strInput.charAt(0);
			int iFirstDigit = Character.getNumericValue(cFirstDigit);
			char cSecondDigit = strInput.charAt(1);
			int iSecondDigit = Character.getNumericValue(cSecondDigit);
			strOutput += twentyPlus[iFirstDigit].toString();
			if (iSecondDigit > 0) {
				strOutput += (" " + digits[iSecondDigit].toString());
			}
		}
		return strOutput;
	}
}
