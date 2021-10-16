package Practice;

import java.util.Arrays;
import java.util.*;

public class P2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[9];
        for (int i=0;i<9;i++){
            num[i] = scan.nextInt();
        }
        int max = num[0];
        int maxL=0;
        for (int i=1;i<num.length;i++){
            if (max < num[i]){
                maxL = i;
                max = num[i];
            }
        }
        System.out.println(max);
        System.out.println(maxL+1);
    }
}
