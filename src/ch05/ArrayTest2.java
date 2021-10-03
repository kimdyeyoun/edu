package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] numberArr = new int[4];
        int sum = 0;

        for (int i=0;i<numberArr.length;i++){
            System.out.printf("숫자%d개를 입력 해주세요 .\n", numberArr.length);
            System.out.printf("숫자%d : ",i+1);
            numberArr[i] = scan.nextInt();
        }

        for (int i=0;i<numberArr.length;i++) {
            sum = sum + numberArr[i];
        }
        System.out.println(sum);
        System.out.println((double)sum/ numberArr.length);
    }
}
