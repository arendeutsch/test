package testProject;

import java.util.Scanner;

public class oppgave3_12 {
	public static void main(String[] args){
		int a,b,c; // declaration of 3 digits for testing
		System.out.println("Please enter a 3 digits number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if (number < 100 || number > 999){
			System.out.println("Invalid number");
			System.exit(1);
		}
		else {
			c = number % 10;
			b = number / 10;
			a = b / 10;
			if (a == c ) 
				System.out.println("The number " + number + " is palindrone");
			else
				System.out.println("The number " + number + " is not palindrone");
		}
		input.close();
		
	}

}
