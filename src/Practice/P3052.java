package Practice;

import java.util.*;

public class P3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        int[] a = new int[10];
        int[] div = new int[10];
        int count = 0;
        for (int i=0;i<10;i++){
            a[i] = scan.nextInt();
        }
        int b = scan.nextInt();

        for (int i = 0;i<10;i++){
            div[i] = a[i] % b;
            hashSet.add(div[i]);

        }
        System.out.println(hashSet.size());

    }
}
