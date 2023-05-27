package inclass;

import java.util.ArrayList;
import java.util.HashSet;

public class Methodpractice {

	public static void main(String[] args) {
		/*String str1 = "Hello Java";
		String str2 = new String("Hello Java");
		System.out.println(str1);
		System.out.println(str2);
		
		if (str1.equals(str2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("different");
		}*/
		ArrayList<String> set = new ArrayList<String>();
		set.add("bread");
		set.add("butter");
		set.add("cheese");
		set.add("ham");
		set.add("ham");
		
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i));
		}
		return;
	}
}