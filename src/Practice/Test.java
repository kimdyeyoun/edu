package Practice;

import java.util.*;

public class Test {
    long sum(int[] a) {
        Scanner scan = new Scanner(System.in);
        long ans = 0;
        for(int i=0;i<a.length;i++){
            int num = scan.nextInt();
            ans = ans + num;
        }
        return ans;
    }
    public static void main(String[] args) {
        Test test = new Test();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println(test.sum(a));
    }
}

