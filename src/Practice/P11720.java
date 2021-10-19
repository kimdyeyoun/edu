package Practice;
import java.util.*;

public class P11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        String a = scan.next();

        for (int i=0;i<n;i++){
            sum = sum + a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
