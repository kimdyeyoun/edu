package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(11);

        System.out.println("홀짝 : " + oddEven);
    }

    public static String getOddEven(int i){
        if(i % 2 == 0) {
            return "짝";
        }
            return "홀";
    }

}
