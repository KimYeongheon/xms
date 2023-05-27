package inclass;

public class CalculatorTester {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		int c1 = cal1.sum(3, 5);
		System.out.println(c1);
		
		int c2 = cal1.sum(3, 4, 5);
		System.out.println(c2);
		
		String c3 = cal1.sum('t', 'b');
		System.out.println(c3);
	
		String c4 = cal1.sum("Lion", "Tiger");
		System.out.println(c4);
		
		double c5 = cal1.sum(3.14, 2.16);
		System.out.println(c5);
	}
}
