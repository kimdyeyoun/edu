package Practice;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(0 <= h && h <= 23 && 0 <= m && m <= 59){
            if (m >= 45){
                m = m -45;
            }else if(h != 0 && m <= 45){
                h--;
                m = m + 15;
            }else{
                m = m + 15;
                h = 23;
            }
            System.out.printf("%d %d",h, m);
        }
    }
}
