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
			e.printStackTrace(); //�� �ڵ带 ��������� �� ������ �ߴ°� <- �� ���� ������ : �� ���� ������ ������ִ� �����̴�.
		}
		finally {
			System.out.println("The End!");
		}
		//�� ������ ������ �Է��ϸ� try �۵�, �� �ܸ� �Է��ϸ� catch �۵�
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		try {
			int num = getNum(); //��� �Լ� ���ǰ� �ƴϰ� ����̶� ���� �Լ� �ȿ� ����.
			System.out.println("Input match complete!");
		} catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatch!");
			e.printStackTrace();
		}
	}
	public static int getNum() throws InputMismatchException { //�Լ� �ȿ��� �Լ��� �������� ������ ���� �Լ� ������ ��.
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}
}