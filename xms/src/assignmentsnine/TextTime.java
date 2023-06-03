package assignmentsnine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextTime {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			FileOutputStream file = new FileOutputStream("sentences.txt");
			Scanner input = new Scanner(System.in);
			System.out.println("Type four sentences");
			for (int i = 0; i < 4; i++) {
				Date d = new Date();
				file.write(format.format(d).getBytes());
				file.write("    ".getBytes());
				String s = input.nextLine();
				file.write(s.getBytes());
				file.write("\n".getBytes());
			}
			file.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}