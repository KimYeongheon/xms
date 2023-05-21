package assignmenteight;

public class MyException extends Exception {
	private int num1;
	
	public MyException(int num1) {
		this.num1 = num1;
	}
	
	public int bringNum1() {
		return num1;
	}
}