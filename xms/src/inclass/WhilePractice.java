package inclass;

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		
		/*System.out.print("input number : ");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int a = 0;
		
		while (a < n) {
			if (a % 2 != 0) { 
			System.out.print(a + " ");
			}
		a = a + 1;
			
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
}