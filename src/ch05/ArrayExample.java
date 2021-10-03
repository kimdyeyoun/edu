package ch05;

public class ArrayExample {
    public static void main(String[] args){
        //배열 (Array)
        /*
        같은 타입의 값을 여러개 저장할때 유용
        for문과 쓰임이 유용
         */

        int [] scores = { 83, 90, 87, 100, 88};
        scores[5] = 11;
        System.out.println(scores.length);
        for (int i=0; i<3; i++){
            System.out.println( scores[i] );
        }
    }
}
