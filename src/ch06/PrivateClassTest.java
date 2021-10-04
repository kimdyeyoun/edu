package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
        pc.defaultVal = 10;
        //pc.val = 10;//private 접근불가능
    }


}
