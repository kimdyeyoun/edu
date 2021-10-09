package Practice;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        int a,b,n,sum=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 1;i<=n;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            sum = a+b;
            System.out.printf("Case #%d: %d\n",i,sum);
        }

    }
}
