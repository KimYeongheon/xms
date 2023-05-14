package assignmentseven;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape sha[] = new Shape[3];
		sha[0] = new Triangle(3, 4);
		sha[1] = new Rectangle(4, 4);
		sha[2] = new Circle(5);
		for (int i = 0; i <= 2; i++)
		{
			sha[i].getArea();
		}
	}
}