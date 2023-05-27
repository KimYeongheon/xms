package inclass;

public class References {
	
	static void doSomething(int x, int[] ys, Student b) {
		x = 99;
		ys[0] = 99;
		b.name = "99";
	}
	
	public static void main(String[] args) {
		int i = 0;
		int[] j = {0};
		Student k = new Student("50", true);
		doSomething(i, j, k);
	}
}