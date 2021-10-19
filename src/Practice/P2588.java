package Practice;

import java.util.*;

public class P2588 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();

        System.out.println(String.valueOf(a * (b.charAt(2)-'0')));
        System.out.println(String.valueOf(a * (b.charAt(1)-'0')));
        System.out.println(String.valueOf(a * (b.charAt(0)-'0')));
        System.out.println(a * Integer.parseInt(b));
    }
}
