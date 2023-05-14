package assignmentseven;

public class Triangle implements Shape {
	int x;
	int y;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getArea() {
		System.out.println("삼각형의 크기: " + x * y / 2);
	}
}