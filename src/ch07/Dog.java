package ch07;

public class Dog extends Animal{
    @Override
    public void crying(){
        System.out.println("강아지 멍멍");
    }
    @Override
    public void eat(){
        System.out.println("강아지는 낼름");
    }

}
