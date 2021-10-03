package ch05;

public class MethodTest {
    public static void main(String[] args) {
        int mon = (int)(Math.random() * 12)+1;
        printSeason(mon);
        printMyself("황장군", 17, 180.82f, 'A');
    }

    public static void printMyself(String name, int year, double cm, char blood){
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d세, 혈액형은 %c형이다.",name, cm, year, blood);
    }

    public static void printSeason(int mon){
        if (mon < 1 || mon > 12){
                System.out.println("잘못된 숫자으 달");
        }else if (mon == 12 || mon >= 2){
                System.out.println("겨울");
        }else if (mon <= 3 || mon >= 5){
                System.out.println("봄");
            }else if (mon <= 6 || mon >= 8){
                System.out.println("여름");
            }else{
                System.out.println("가을");
            }
        System.out.println(mon);
    }
}
