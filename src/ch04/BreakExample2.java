package ch04;

public class BreakExample2 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            for (int z=100;z<110;z++){
                if (z == 103){ break; }
                System.out.printf("%d - %d\n", i, z);
            }
        }
        System.out.println("-------------------");
        OUT_FOR:
        for (int i=0; i<10; i++){
            for (int z=100;z<110;z++){
                if (i == 3){ break OUT_FOR; }//바깥 FOR문 박살
                System.out.printf("%d - %d\n", i, z);
            }
        }

    }
}
