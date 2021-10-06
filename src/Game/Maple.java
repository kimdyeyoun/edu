package Game;
import java.util.*;

public class Maple {
    Scanner sc = new Scanner(System.in);
    static int damage;//다른클래스에서 static 메서드 호출

    void server(){

        for (;;) {
            System.out.println("메이플 스토리 서버 선택해주세요.");
            System.out.println("1.크로아 2.스카니아 3.루나");
            System.out.print("선택 : ");
            int n1 = sc.nextInt();
            switch (n1) {
                case 1:
                    System.out.println("크로아");
                    break;
                case 2:
                    System.out.println("스카니아");
                    break;
                case 3:
                    System.out.println("루나");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다! 다시 선택해주세요");
                    System.out.println();
            }
            if (n1 == 1 || n1 == 2 || n1 == 3){
                break;
            }
        }
    }

     void user() {
        int avg, sum = 0;
        System.out.println("\t캐릭터 능력치\t");
        System.out.print("주사위를 굴립니다. 아무키나 입력 : ");
        String start = sc.next();
         int s = (int) (Math.random() * 10) + 1;
         int m = (int) (Math.random() * 10) + 1;
         int i = (int) (Math.random() * 10) + 1;
         int hp = 30;
         int mp = 10;
         sum = s + m + i;
         avg = sum / 3;
         damage = avg;
         System.out.printf("힘 : %d ", s);
         System.out.printf("민첩 : %d ", m);
         System.out.printf("지능 : %d \n", i);
         System.out.println("hp : " + hp);
         System.out.println("mp : " + mp);
         System.out.println("현재 공격력 : "+ damage);
         System.out.print("주사위를 다시 굴리시겠습니까? Y/N : ");
         String start2 = sc.next();

    if (start2.equals("Y")||start2.equals("y")) {
        for (; ;) {
            s = (int) (Math.random() * 10) + 1;
            m = (int) (Math.random() * 10) + 1;
            i = (int) (Math.random() * 10) + 1;

            sum = 0;
            sum = s + m + i;
            avg = sum / 3;
            damage = avg;
            System.out.printf("힘 : %d ", s);
            System.out.printf("민첩 : %d ", m);
            System.out.printf("지능 : %d \n", i);
            System.out.println("hp : " + hp);
            System.out.println("mp : " + mp);
            System.out.println("현재 공격력 : "+ damage);
            System.out.print("주사위를 다시굴리시겠습니까? Y/N : ");
            String start1 = sc.next();
            if(start1.equals("N")||start1.equals("n")){
                damage = avg;
                break;
            }
        }
    }

}



    protected int damage1(int i){
        return damage;
    }

}
