
public class MusicTester {

	public static void main(String[] args) {
		Music musics[] = {new GenreMusic("Destiny", "Beethoven", "Symphony")
				, new GenreMusic("Messiah", "Handel", "Oratorio")
				, new GenreMusic("Four Seasons", "Vivaldi", "Concerto")}; 
				
		System.out.println("--- Play List ---");
		
		for (int i = 0; i < musics.length; i++) {
			musics[i].printPlaydata();
		}
	}
}