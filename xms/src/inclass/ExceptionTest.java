package inclass;

public class ExceptionTest {

	public static void main(String[] args) {
		int a;
		try {
			a = 4 / 0;
		}
		catch (ArithmeticException e) {
			a = -1;
		}
		System.out.println(a);
		
		/*int data = 50/0;
		System.out.println("rest of the code");*/
		
		String s;
		try {
			s = null;
			System.out.println(s.length());
			//���⼭ s�� null�� �Ҵ��ϴ� ���� ������ �ƴϰ� null�� ���̸� ����Ϸ��� �ϴ� ���� ������ ���̴�.
		}
		catch (NullPointerException e) {
			s = "hi";
			System.out.println(s.length());
		}
		
		int b[] = new int[5];
		try {
			b[10] = 50;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			b[4] = 50;
		}
		System.out.println(b[4]);
		
		int i;
		try {
			String p = "abc";
			i = Integer.parseInt(p);
			//Integer.parseInt(p) <- ��� ���ڸ� ���ڷ� �ٲ��ִ°Ŷ� String p = "123";�̸� ���� �߻� ���� 
		}
		catch (NumberFormatException e) {
			i = 3;
		}
		System.out.println(i);
	}
}