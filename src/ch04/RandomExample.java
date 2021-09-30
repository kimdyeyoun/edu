package ch04;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6);//Type은 double
        System.out.println("num : " + num);

        //2~7 Random
        int num2 = (int)(Math.random() * 6) + 2;
        System.out.println("num2 : " + num2);

        //55~108 Random
        int num3 = (int)(Math.random() * 54) + 55;
        System.out.println("num2 : " + num3);
    }
}
