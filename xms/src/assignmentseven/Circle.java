package assignmentseven;

public class Circle implements Shape {
	int r;
	double pi = 3.14;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public void getArea() {
		System.out.println("���� ũ��: " + r * r * pi);
	}
}