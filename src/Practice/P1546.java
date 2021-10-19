package Practice;

import java.util.*;

public class P1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] num = new int[n];
        double m = num[0];
        double avg = 0;
        double sum = 0;
        double avgJ = 0;

        for (int i=0;i<n;i++) {
           num[i] = scan.nextInt();
            if (m < num[i]){
                m = num[i];
            }
        }
        Arrays.sort(num);

        for (int i=0;i<n;i++){
           avg = num[i]/m *100;
           sum = sum + avg;
        }
        avgJ = sum / n;
        System.out.println(avgJ);
    }
}
