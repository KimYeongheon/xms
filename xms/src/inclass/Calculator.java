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
	}//����� ""�� �ִ� ���� : �׳� x+y�� �ϸ� �� ��� �´� ���ڰ� �����ٵ�
	//���� Ÿ���� String�̹Ƿ� ""�� ���ؼ� String���� ����ϰ� ����.(�Ƹ�?)
	
	double sum(double x,double y) {
		return x+y;
	}
}