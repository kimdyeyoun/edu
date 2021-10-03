package ch05;

public class ArrayTest {
    public static void main(String[] args){
        int [] scores = {100, 87, 56, 23, 98, 30, 32 ,17, 22};
        int hap = 0;
        //점수가 짝수인 수만 프린트
        //점수가 홀수인 친구만 합계 점수 프린트

        for (int i=0;i<scores.length;i++){
            if (scores[i] % 2 == 0){System.out.println(scores[i]);}
            else{hap = hap + scores[i];}
        }
        System.out.println("홀수의 합은 : " + hap);
    }
}
