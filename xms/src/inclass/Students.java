package inclass;

public class Students extends Person {
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("id: " + this.id);
		super.print();
	}
}
