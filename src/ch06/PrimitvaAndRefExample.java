package ch06;

public class PrimitvaAndRefExample {
    public static void main(String[] args) {
        int val = 10;
        Box box = new Box();
        box.val = 10;

        Box box2 = new Box();
        box2.val = 20;


        System.out.println("val : " + val);
        changeVal(val);
        System.out.println("val : " + val);
        System.out.println("-----");
        System.out.println("box.val : " + box2.val);
        changeVal(box);
        System.out.println("box.val : " + box.val);
    }
    public static void changeVal(int pval){
        pval = 30;
    }
    public static void changeVal(Box box){
        box.val = 30;
    }
}


class Box{
    int val;
}
