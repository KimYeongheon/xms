package inclass;

public class EunmTester {
	
	public enum Level2 {
		easy,
		hard
	}

	public static void main(String[] args) {
		Level mylevel = Level.LOW;
		
		System.out.println(mylevel);
		System.out.println(mylevel.ordinal);
		System.out.println(mylevel.name);
		
		System.out.println(mylevel.ordinal());
		System.out.println(mylevel.name());
		
		Level2 ml = Level2.hard;
		
		System.out.println(ml.ordinal());
		System.out.println(ml.name());
		
		System.out.println("-----------------------------------");
		
		switch(mylevel) {
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium Level");
				break;
			case HIGH:
				System.out.println("High Level");
				break;
		}
		
		System.out.println("-----------------------------------");
		
		for (Level myVar : Level.values()) {
			System.out.println(myVar);
		}

	
	}
}