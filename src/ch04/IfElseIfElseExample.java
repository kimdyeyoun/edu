package ch04;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90){
            System.out.println("A등급");
        }else if(score >= 80){
            System.out.println("B등급");
        }else if(score >= 70){
            System.out.println("c등급");
        }else {
            System.out.println("D등급");
        }
    }
}
