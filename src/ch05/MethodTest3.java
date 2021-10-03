package ch05;
import java.util.*;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40);

        int absVal = getABS(10);
        System.out.println(absVal);
        int absVa2 = getABS(-10);
        System.out.println(absVa2);
    }

    public static int getRandom(int n1 ,int n2){

            int result = (int) (Math.random() * (n2 - n1 + 1)) + n1;
            System.out.println(result);

        return result;
    }

    public static int getABS(int val){
        return val < 0 ? -val : val;
    }
}
