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
			//여기서 s에 null을 할당하는 것이 문제가 아니고 null의 길이를 출력하려고 하는 것이 오류인 것이다.
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
			//Integer.parseInt(p) <- 얘는 문자를 숫자로 바꿔주는거라서 String p = "123";이면 오류 발생 안함 
		}
		catch (NumberFormatException e) {
			i = 3;
		}
		System.out.println(i);
	}
}