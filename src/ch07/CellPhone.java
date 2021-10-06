package ch07;
//부모 클래스 추상적 abstract
//자식 클래스 디테일 detail
public class CellPhone {
    String model;
    String color;

    public CellPhone(){//파라미터 값에 아무것도 없는것 기본생성자
       // this("노트10","white"); this생성자를 사용하면 super();쓸 수 없다.
    }
    public CellPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    void printInfo() {
        System.out.printf("model : %s, color : %s\n", model, color);
    }

    void sendMsg(String msg){
        System.out.println("보낸 메세지 : " + msg);
    }




}
