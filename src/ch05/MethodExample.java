package ch05;

public class MethodExample {
    public static void main(String[] args) {
        sum(10, 20);//메소드를 호출한다.
        sum(50, 100);
        minus(50,20);
        minus(40,100);
    }
    public static void sum(int n1, int n2){
        System.out.println("sum : " + (n1+n2));
    }

    public static void minus(int n1, int n2){
        System.out.println("minus : " + (n1-n2));
    }
}
