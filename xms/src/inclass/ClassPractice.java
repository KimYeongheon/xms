package inclass;

public class ClassPractice{
	public static void main(String[] args) {
		Student Shiloh = new Student("Shiloh", true);
		Shiloh.name = "Shiloh Jolie-Pitt";
		Shiloh.sayHi();
		Shiloh.isMale = true;
		System.out.println(Shiloh.name);
		System.out.println(Shiloh.isMale); 
	}//여기서 Student는 Student파일에 있는 함수를 호출하여 사용
}//Student("jessy", 123); -> 여기서 인자가 있으면 함수에서도 같이 인자가 있어야하고 없으면 함수도 같이 없어야한다.
//public을 붙여서 다른 파일에 있는 클래스도 사용이 가능한 것이다.