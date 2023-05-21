package assignmenteight;

import java.util.Scanner;

public class MyExceptionTester {
	
	public static void main(String[] args) {
		try {
			int num1 = checkNum1();
			System.out.printf("%d is an even number.", num1);
		} catch(MyException e) {
			System.out.printf("Error, %d is an odd number.", e.bringNum1());
		}
	}
	
	public static int checkNum1() throws MyException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input an even number: ");
		int num1 = input.nextInt();
		
		if (num1 % 2 != 0) {
			throw new MyException(num1);
		}
		return num1;
	}
}