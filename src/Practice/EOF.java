package Practice;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){//EOF
            int a = scan.nextInt();
            int b = scan.nextInt();
            int p = a+b;
            if (p == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
