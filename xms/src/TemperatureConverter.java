import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		int F;
		double C;
		
		Scanner sc = new Scanner(System.in);
		F = sc.nextInt();
		
		C = (double)5 / 9 * (F - 32);
		
		System.out.println("F-Temperature: " + F);
		System.out.println("C-Temperature: " + (int)C);
		
	}

}