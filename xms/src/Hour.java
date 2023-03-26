
public class Hour {

	public static void main(String[] args) {
		int s, s1, m, h, d;
		s = 100000;
		m = s/60%60;
		h = s/60/60%24;
		d = s/60/60/24;
		s1 = s%60;
		
		System.out.println(d+"일 "+h+"시간 "+m+"분 "+s1+"초");
		
		if (d >= 365) {
			System.out.println("일년을 넘습니다.");
		}
		else {
			System.out.println("일년을 넘지 않습니다.");
		}
	}

}
