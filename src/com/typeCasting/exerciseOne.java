package com.typeCasting;

import java.util.Scanner;

public class exerciseOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("The user take 1-100 number: ");
        
        String number = input.nextLine();
        
        int numInt = Integer.parseInt(number);
        
        byte numByte = Byte.parseByte(number);
        
        System.out.println("interger value: "+numInt);
        System.out.println("byte value "+numByte);
         
        
        
	}

}
