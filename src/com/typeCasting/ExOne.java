package com.typeCasting;

import java.util.Scanner;

public class ExOne {

	public static void main(String[] args) {
		Scanner myInput = new Scanner( System.in );
		

		System.out.print( "Enter integer value: ");
		int num = myInput.nextInt();


		float numFloat = num;
		double numDouble = numFloat;
		byte numByte = (byte) numDouble;
 


		System.out.println("Float value :"+numFloat);
		System.out.println("Double value :"+numDouble);
		System.out.println("Byte value :"+numByte);

	}