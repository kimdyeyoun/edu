package ch06;

public class PrimitvaAndRefExample2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.val = 3;

        Box box2 = new Box();
        box2.val = 5;

        System.out.println(box1.val);
        System.out.println(box2.val);
        PrimitvaAndRefExample.changeVal(box1);
        PrimitvaAndRefExample.changeVal(box2);
        System.out.println(box1.val);
        System.out.println(box2.val);
    }
}







