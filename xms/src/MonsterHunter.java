import java.util.Scanner;

public class MonsterHunter {
    public static void main(String[] args) {
        Monster dragon = new Monster(1000);
        Hunter king = new Hunter(100);

        Scanner input = new Scanner(System.in);

        while (dragon.getHp() > 0) {
            System.out.println("진짜 드래곤을 공격하실 겁니까?(네 또는 아니요)");
            String x = input.nextLine();

            if (x.equals("네")) {
                king.attack();
                int hp = dragon.getHp();
                int resthp = hp - 100;
                dragon.setHp(resthp);
                System.out.printf("Monster has %d hp.\n", dragon.getHp());
            } else if (x.equals("아니요")) {
                System.out.println("후퇴합니다");
                break;
            } else {
                System.out.println("다시 입력하세요");
            }
        }
        if(dragon.getHp()==0){
            System.out.println("\"끄아아..아악..\" 드래곤을 물리쳤습니다.\n");
            System.out.println("당신은 지구를 구한 영웅입니다.");
        }
    }
}