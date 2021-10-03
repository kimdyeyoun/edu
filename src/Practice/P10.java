package Practice;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;
            result = a+b;
            System.out.println(result);
        }
    }
}
