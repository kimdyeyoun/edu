package ch02;

public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'A';

        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl = false;// 참 혹은 거짓 if문에서 많이사용.
        System.out.println(bl);

        //boolean
        //-> 자동형변환가능 <- 수동형변환
        //byte < short < int < long < floot < double < String (대문자로 시작하는 변수 reference변수 소문자 원시변수)
    }
}
