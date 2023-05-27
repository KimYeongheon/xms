package inclass;

public class PersonTester {

	public static void main(String[] args) {
		Students std = new Students();
		Professor prof = new Professor();
		std.setName("Kim");
		std.setId(12345);
		prof.setName("Park");
		prof.setOffice(365);
		std.print();
		prof.print();
		
		Person ps[] = new Person[2];
		ps[0] = std;
		ps[1] = prof;
		for (int i = 0; i < 2; i++) {
			ps[i].print();
		}
	}
}
