package ch05;

public class ArrayInArrayTest {
    public static void main(String[] args) {
        int sum =0, avg=0;
        int[][] scores = {
                {75, 100, 88},//수학
                {98, 100, 76},//영어
                {100, 90, 100},//국어
        };

        String[] names = {"김영희", "김철수", "홍길동"};
        String[] ga = {"국어", "영어", "수학"};

        for(int i=0; i < scores.length;i++){
            for (int z=0; z<scores[i].length;z++){
                System.out.printf("%d ",scores[i][z]);
                sum = sum + scores[i][z];
                avg = sum / scores.length;
            }
            System.out.println();
            System.out.printf("%s총점 : %d \n",names[i] ,sum);
            System.out.printf("평균 : %d \n", avg);
            sum =0;
            System.out.println();
        }

        for(int i=0; i < scores.length;i++) {
            for (int z =0; z < scores[i].length; z++) {
                System.out.print(scores[z][i]+" ");
                sum = sum + scores[z][i];
                avg = sum / scores.length;
            }
            System.out.println();
            System.out.printf("%s : %d \n",ga[i] ,sum);
            System.out.printf("평균 : %d \n", avg);
            System.out.println();
            sum =0;
        }

    }
}
