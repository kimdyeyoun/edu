package ch07;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();//상속관계
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);


        int removeVal = list.remove(0);
        System.out.println("removeVal : "+ removeVal);
        for (int i = 0;i<list.size();i++){
            System.out.printf("%d - %d \n",i, list.get(i));
        }

        System.out.println(list);

        MyArrayList my = new MyArrayList();
        my.add(10);
        my.add(20);
        my.add(30);
        my.add(100);
        my.print();
    }
}
