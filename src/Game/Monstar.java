package Game;

import java.util.Arrays;
import java.util.Scanner;

public class Monstar extends Maple {
    public int avg;
    Scanner sc = new Scanner(System.in);
    int attack, tem;
    String it = Item.item;


    int area(int n1) {
        String[] areas = {"헤네시스 마을 ", " 폐리온 ", " 커닝시티 : "};
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%d.%s", i + 1, areas[i]);
        }
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\t\t%s\t\n", areas[0]);
                System.out.print("몬스터 선택 : 1.초록달팽이 2.파란달팽이 3.빨간달팽이 : ");
                int monster = sc.nextInt();
                if (monster == 1) {
                    System.out.println("초록달팽이가 소환 되어 있습니다 체력(10)");
                    int hp = 10;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("달팽이 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("초록달팽이 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 41);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 80, i - j);
                        if (80 < (i - j)) {
                            it = "초록달팽이껍질";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 1드랍");
                        }

                    }
                } else if (monster == 2) {
                    System.out.println("파란달팽이가 소환 되어 있습니다 체력(18)");
                    int hp = 18;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("파란달팽이 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("파란달팽이 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 61);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 70, i - j);
                        if (70 < (i - j)) {
                            it = "파란달팽이껍질";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 3드랍");
                        }

                    }
                } else if (monster == 3) {
                    System.out.println("빨간달팽이가 소환 되어 있습니다 체력(45)");
                    int hp = 45;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("빨간달팽이 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("빨간달팽이 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 81);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 60, i - j);
                        if (60 < (i - j)) {
                            it = "뻘간달팽이껍질";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 5드랍");
                        }
                    }
                }


            case 2:
                System.out.printf("\t\t%s\t\n", areas[1]);
                System.out.print("몬스터 선택 : 1.스텀프 2.다크스텀프 3.엑스스텀프 : ");
                int monster1 = sc.nextInt();
                if (monster1 == 1) {
                    System.out.println("스텀프가 소환 되어 있습니다 체력(50)");
                    int hp = 50;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("스텀프 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("스텀프 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 41);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 80, i - j);
                        if (80 < (i - j)) {
                            it = "장작";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 10드랍");
                        }

                    }
                } else if (monster1 == 2) {
                    System.out.println("다크스텀프가 소환 되어 있습니다 체력(68)");
                    int hp = 68;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("다크스텀프 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("다크스텀프 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 61);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 70, i - j);
                        if (70 < (i - j)) {
                            it = "마른 장작";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 15드랍");
                        }

                    }
                } else if (monster1 == 3) {
                    System.out.println("엑스스텀프가 소환 되어 있습니다 체력(75)");
                    int hp = 75;
                    if (hp != 0) {
                        for (; hp > 0; ) {
                            System.out.print("A키를 눌러 공격해주세요!!(입력: A) : ");
                            String numA = sc.next();
                            if (numA.equals("A") || numA.equals("a")) {
                                hp = hp - damage1(damage);
                                System.out.printf("엑스스텀프 데미지 -%d : \n", damage);

                            }
                        }
                        System.out.println("엑스스텀프 처치!");
                        int i = 100;
                        int j = (int) (Math.random() * 81);
                        System.out.printf("\t아이템 획득 확률공개\t \n성공확률 %d%% 나의 확률 %d%% : ", 60, i - j);
                        if (60 < (i - j)) {
                            it = "도끼팬장작";
                            System.out.println(it + "획득!");
                        } else {
                            System.out.println("메소 5드랍");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("개발전 지역입니다.");
                break;

        }
        return n1;
    }
}