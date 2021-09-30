package ch04;
import java.util.*;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력하세요 (정지:0) : ");
        int i = scan.nextInt();
        int sum = 0;
        sum = sum + i;

        while(i != 0){
            System.out.print("숫자를 입력하세요 (정지:0) : ");
            int j = scan.nextInt();
            if (j != 0){
                sum = sum + j;
            }else if (j==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
