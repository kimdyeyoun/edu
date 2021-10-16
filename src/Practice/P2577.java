package Practice;

import java.util.*;

public class P2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = (scan.nextInt())* scan.nextInt()* scan.nextInt();
        String str = Integer.toString(sum);


        for (int i=0;i<1;i++){//문자로 바뀐 str비교
            int count = 0;
            for (int j=0;j<str.length();j++){
                if ((str.charAt(j) - '0') == i){//charAt 출력
                        count++;
                }
            }System.out.println(count);
        }

    }
}
