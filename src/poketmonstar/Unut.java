package poketmonstar;

import java.util.Scanner;

public class Unut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        int n = scan.nextInt();
        int x = scan.nextInt();
        for (int i=1;i<=n;i++){
            int a = scan.nextInt();
            if (a < x){
                System.out.println(a);
            }
        }

    }
}
