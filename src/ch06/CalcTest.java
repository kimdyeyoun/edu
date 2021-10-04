package ch06;

public class CalcTest {
    public static void main(String[] args) {
        String str = "10";
        int intStr = Integer.parseInt(str);//클래스명. static *
        System.out.println(intStr + 10);
        int result = StaticCalc.sum(10,20);
        System.out.println("static sum : " + result);

        Calc cl = new Calc();
        cl.n1 = 10;
        cl.n2 = 20;
        int result2 = cl.sum();
        System.out.println("static sum : " + result);
    }
}
