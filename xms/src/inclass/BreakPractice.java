package inclass;

import java.util.Scanner;

public class BreakPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("100 �޸��� ����� �Է��Ͻÿ� : ");
		double w = input.nextDouble();
		double w1 = w / 3600;
		System.out.printf("����� �ü��� : %d", (int)(0.1 / w1));
	}

}
