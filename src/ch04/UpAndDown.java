package ch04;

import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 100) + 1;


        for (;;){
            System.out.print("숫자를 입력하시오 1~ 100 :");
            int num = sc.nextInt();
            if (num < random){
                System.out.println("UP");
            }else if (num > random){
                System.out.println("Down");
            }else {
                System.out.println("정답");
                break;
            }
        }
    }
}
