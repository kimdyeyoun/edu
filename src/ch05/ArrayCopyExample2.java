package ch05;

public class ArrayCopyExample2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length];// arr1자체를 하나 구성한다 무에서 유를창조

        //깊은 복사(deep copy)
        //시도


        for (int i=0;i<arr2.length;i++){
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
        System.out.println(arr1==arr2);

    }
}
