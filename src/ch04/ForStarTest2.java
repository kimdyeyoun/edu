package ch04;

public class ForStarTest2 {
    /*
    if star == 2
    *
    **

    if star == 3
    *
    **
    ***
    */
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 2;
        System.out.println(star);
//        for (int i=0; i < star; i++){ //줄 생성
//            for (int j = 0;j <= i;j++){//프린트 생성
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for(int i = 0; i < star;i++){
//            for (int j=star; i < j;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        for (int i=star; i >= 1; i--){
            for (int j =1; j <= star; j++){
                if (j < i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}
