package ch02;

public class PrintExample {

    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("--------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");

        String nm = "홍길동";
        int age = 17000;
        float height = (float)180.8;
        char bloodType = 'A';

        System.out.printf("%s의 키는 %.1fcm 나이는 %,d세 혈액형은 %c형이다",nm, height, age,bloodType);// ,천단위 나눠줄 때 많이쓰임
    }
}
