package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, val =0;

        while (true){
            System.out.print("숫자를 입력하세요 (정지:0) : ");
            val = scan.nextInt();
            sum = sum + val;
            if(val ==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
