package inclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest2 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatch!");
			e.printStackTrace(); //이 코드를 실행시켰을 때 오류가 뜨는건 <- 이 문장 때문에 : 이 문은 오류를 출력해주는 문장이다.
		}
		finally {
			System.out.println("The End!");
		}
		//위 문장은 정수를 입력하면 try 작동, 그 외를 입력하면 catch 작동
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		try {
			int num = getNum(); //얘는 함수 정의가 아니고 사용이라서 메인 함수 안에 있음.
			System.out.println("Input match complete!");
		} catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatch!");
			e.printStackTrace();
		}
	}
	public static int getNum() throws InputMismatchException { //함수 안에서 함수를 정의하지 않으니 메인 함수 밖으로 뺌.
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}
}