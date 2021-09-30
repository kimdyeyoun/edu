package ch04;

public class ForTest4 {
    public static void main(String[] args){

        int name = 10;

        for (int i=1;i<name;i++){
            for (int z=2;z<name;z++){
                System.out.printf("%d * %d = %d\t", z, i, (i*z));
            }
            System.out.println();
        }

    }
}
