package Game;
import java.util.*;

public class Names extends Maple {
    Scanner sc = new Scanner(System.in);

    String name(String name) {
        System.out.print("닉네임 : ");
        String name1 = sc.next();
        System.out.println("닉네임은 "+ name1 + "입니다.");

        for (; ; ) {
            System.out.print("닉네임을 재설정 하시겠습니까? (Y/N) : ");
            String trials = sc.next();
            if (trials.equals("y") || trials.equals("Y")) {
                System.out.print("닉네임 : ");
                String name2 = sc.next();
                name1 = name2;
                System.out.println("닉네임은 "+ name1 + "입니다.");
            } else if (trials.equals("n") || trials.equals("N")) {
                break;
            }
        }
        return name1;
    }

}
