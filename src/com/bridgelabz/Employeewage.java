package com.bridgelabz;

import java.util.Random;

public class Employeewage {

	public static void main(String[] args) {
           
		int isPresent=1;
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(2);
		
		if(randomNumber == isPresent) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}

	}

}
