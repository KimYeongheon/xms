package assignmentseven;

public class Triangle implements Shape {
	int x;
	int y;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getArea() {
		System.out.println("�ﰢ���� ũ��: " + x * y / 2);
	}
}