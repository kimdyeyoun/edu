package ch06;

public class PrivateClass {
    private int val;
    int defaultVal;//default

    public PrivateClass(){}
    private void print() {// class PrivateClass 여기안에서만 사용이 가능하다
        System.out.println("프린트!");
    }
}
