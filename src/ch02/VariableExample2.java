package ch02;

public class VariableExample2 {

    public static void main(String[] args) {
        float f;
        double d;

        int n1;

        f = (float)10.1;
        d = 10.1;

        double d2 = f * f;
        //계산이 이루어 지려면 타입이 같아야한다.(자동형변환)
        //ex)) float f2 = (float) (d * d) 수동변환 해줘야 가능 float이 double보다 작기때문
    }
}
