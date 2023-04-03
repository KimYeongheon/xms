import java.util.Scanner;

public class Calculator {
    
	public static void main(String [] args){
        Scanner input = new Scanner(System.in); //Scanner 선언

        System.out.println("숫자를 입력하세요 :");
        int num_1 = input.nextInt(); //입력받은 숫자를 저장할 정수형 변수 num_1
        System.out.println("숫자를 입력하세요 :");
        int num_2= input.nextInt();//입력받은 숫자를 저장할 정수형 변수 num_2
        System.out.println("연산자를 입력하세요(+,-,*,/만 가능) :");
        char operate= input.next().charAt(0) ;//Scanner로 문자를 입력받을 수 없기 때문에 next로 문자열을 입력받고 charAt(0)을 통해
        //입력받은 문자열을 첫번째 문자를 꺼내서 저장해주었다.
        int num_3;//계산 결과를 저장해줄 정수형 변수 선언

        switch(operate){
            case '+':
                num_3=num_1+num_2;
                System.out.printf("두 수의 합은 %d 입니다",num_3);
                break;
            case '-':
                num_3=num_1-num_2;
                System.out.printf("두 수의 차는 %d 입니다",num_3);
                break;
            case '*':
                num_3=num_1*num_2;
                System.out.printf("두 수의 곱은 %d 입니다",num_3);
                break;
            case '/':
                num_3=num_1/num_2;
                System.out.printf("두 수의 나눗셈의 몫은 %d 입니다",num_3);
                break;
            default:
                System.out.println("지원하지 않는 연산입니다.");
        }
        
    }
	
}