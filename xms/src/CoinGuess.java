import java.util.Scanner;

public class CoinGuess {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //Scanner클래스 선언
		
		System.out.print("Guess the coin toss. H or T: ");
		String guess = input.nextLine(); //사용자로부터 입력을 받아 문자열 변수 guess에 입력값 저장
		
		int computer = (int)(Math.random()*2);
		//정수형 변수computer에 랜덤함수 Math.random을 활용하여 0과 1이 랜덤으로 변수에 들어가도록 설정
		
		if(guess.equals("H")){ //입력받은 값과 "H"가 같다면 실행
			if(computer == 0){ //computer가 앞면을 뽑은 경우
				System.out.println("correct");
				}            
			else if(computer == 1){ //computer가 뒷면을 뽑은 경우
				System.out.println("incorrect");
				}
			}        
		else if(guess.equals("T")){ //입력받은 값과 "T"가 같다면 실행
			if(computer == 0){ //computer가 앞면을 뽑은 경우
				System.out.println("incorrect");
				}            
			else if(computer == 1){ //computer가 뒷면을 뽑은 경우
				System.out.println("correct");
			}
		}
		else {
			System.out.println("input only 'H' or 'T'");
		}
	}
}