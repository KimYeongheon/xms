package inclass;

public class Professor extends Person{
	private int office;
	public void setOffice(int office) {
		this.office = office;
	}
	
	public void print() {
		System.out.println("office: " + this.office);
		super.print();
	}
}
