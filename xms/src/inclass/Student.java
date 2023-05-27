package inclass;

public class Student {
	String name;
	int studentid;
	boolean isMale;

	Student(String anyname, boolean s){
		name = anyname;
		this.studentid = studentid;
		boolean isMale = s;
	}
	public void printName() {
		System.out.println(name);
	}
	void sayHi() {
		System.out.println("Hi, my name is.. " + name);
	}
}