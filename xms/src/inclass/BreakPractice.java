package inclass;

import java.util.Scanner;

public class BreakPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("100 달리기 기록을 입력하시오 : ");
		double w = input.nextDouble();
		double w1 = w / 3600;
		System.out.printf("당신의 시속은 : %d", (int)(0.1 / w1));
	}

}
