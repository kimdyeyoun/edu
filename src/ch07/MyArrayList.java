package ch07;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr = new int[0];

    public void add(int val) {
        //??????
        int[]temp = new int[arr.length +1];
        for(int i=0;i<arr.length;i++)
        {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }

    public void print(){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if (i !=0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");

    }
}
