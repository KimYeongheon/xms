package inclass;

public class MyException extends Exception{
	private int num;
	
	public MyException(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
