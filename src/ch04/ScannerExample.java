package ch04;
import java.util.*;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//
        System.out.println("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.println("나이 : " + age);
    }
}
