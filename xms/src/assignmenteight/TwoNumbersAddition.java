package assignmenteight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbersAddition {

	public static void main(String[] args) {
		try {
			int result = addition();
			System.out.println("result = " + result);
		} catch(InputMismatchException e) {
			System.out.println("Input only numbers");
		}
	}

	public static int addition() throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("num1: ");
		int num1 = input.nextInt();
		
		System.out.print("num2: ");
		int num2 = input.nextInt();
		
		return (num1 + num2);
	}
}