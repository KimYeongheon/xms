package inclass;

public class Calculator {
	int sum(int x, int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	String sum(String x, String y) {
		return x+y;
	}
	
	String sum(char x, char y) {
		return (""+x+y);
	}//빈공백 ""이 있는 이유 : 그냥 x+y만 하면 그 영어에 맞는 숫자가 나올텐데
	//리턴 타입이 String이므로 ""를 통해서 String으로 출력하게 만듦.(아마?)
	
	double sum(double x,double y) {
		return x+y;
	}
}