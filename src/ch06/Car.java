package ch06;

public class Car {
    String nm;
    String brand;
    Car() {}

    Car(String brand,String nm) {//지역변수, 전역변수
        this.brand = brand;
        this.nm = nm;
    }
    //기본 생성자
    //1. 클래스명이 같다
    //2. 리턴 타입이 없어야 한다.
    //* 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다.

    //오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    public void drive(){
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }

    public void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
