package Practice;

import java.util.*;

public class P19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d1;
        while (true){
            int a = scan.nextInt();
            if(0 >= a|| a <= 99){
                d1 = (double)a / 100;
                System.out.printf("%.2f",d1);
            }
        }

    }
}
