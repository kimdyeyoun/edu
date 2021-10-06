package ch06;
/*
    클래스 > 붕어빵틀
    객체 > 붕어빵

    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 멤버 메소드 (생성자)
     //static final 상수 조건 클래스
	 // final 상수조건 메인메소드
	 //필드(상태, 속성)
	 //생성자(필드 초기화) 생성클래스랑 이름동일
	 // super(); 생략이되어있다. object와 부모와 자식관계
	 //메소드(동작)

	 //오버로딩 : 똑같은 변수명의 메소드를 여러개 만들 수 있는 기술
	 // 매개변수의 1.타입2.개수3.위치
 */

public class Car {//필드
    String nm;
    String brand;
    Car() {}

    Car(String brand,String nm) {//지역변수, 전역변수 //생성자 public 생략가능
        this.brand = brand;
        this.nm = nm;
    }
    //기본 생성자
    //1. 클래스명이 같다
    //2. 리턴 타입이 없어야 한다.
    //* 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다.

    //오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    public void drive(){ //메소드
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }

    public void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
