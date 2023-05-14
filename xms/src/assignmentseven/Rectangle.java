package assignmentseven;

public class Rectangle implements Shape {
	int x;
	int y;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getArea() {
		System.out.println("사각형의 크기: " + x * y);
	}
}