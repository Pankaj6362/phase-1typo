package com.typeCasting;

import java.util.Scanner;

public class Extwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("User Input as String :");

		String number = input.nextLine();

		int numInt = Integer.parseInt(number);
		
		byte numByte = Byte.parseByte(number);

		float numFloat = Float.parseFloat(number);

		double numDouble = Double.parseDouble(number);

		System.out.println("User Input as Interger : "+numInt);
		System.out.println("User Input as Byte : "+numByte);
		System.out.println("User Input as Float : "+numFloat);
		System.out.println("User Input as Double : "+numDouble);

	}

}
