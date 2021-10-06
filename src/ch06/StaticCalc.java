package ch06;

public class StaticCalc {
    //static 메모리에 스스로 올라간다.
    //static 미리 메모리에 올라간다.
    //static 객체화 (인스턴스)가 없음

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    //static 메소드 장려!!!
    //파라미터 값만 사용할때 (멤버필드 사용x)
    //멤버 필드를 사용하는데 그멤버필드가 static경우
}