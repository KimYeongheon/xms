import java.util.Scanner;

public class MonsterHunter {
    public static void main(String[] args) {
        Monster dragon = new Monster(1000);
        Hunter king = new Hunter(100);

        Scanner input = new Scanner(System.in);

        while (dragon.getHp() > 0) {
            System.out.println("��¥ �巡���� �����Ͻ� �̴ϱ�?(�� �Ǵ� �ƴϿ�)");
            String x = input.nextLine();

            if (x.equals("��")) {
                king.attack();
                int hp = dragon.getHp();
                int resthp = hp - 100;
                dragon.setHp(resthp);
                System.out.printf("Monster has %d hp.\n", dragon.getHp());
            } else if (x.equals("�ƴϿ�")) {
                System.out.println("�����մϴ�");
                break;
            } else {
                System.out.println("�ٽ� �Է��ϼ���");
            }
        }
        if(dragon.getHp()==0){
            System.out.println("\"���ƾ�..�ƾ�..\" �巡���� �����ƽ��ϴ�.\n");
            System.out.println("����� ������ ���� �����Դϴ�.");
        }
    }
}