package ch04;

public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<=100;i++){
            if (i % 2 == 0)
            {
                System.out.printf("%d + %d = %d\n", sum, i, (sum+i));
                sum = sum + i;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
