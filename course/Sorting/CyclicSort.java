package course.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void cyclic(int[] arr){
        int i = 0;
//        while (i < arr.length) {      //My code
//            if(arr[i] != i+1){
//                swap(arr, i, arr[i]-1);
//            }
//            else {
//                i++;
//            }
//        }

        while (i < arr.length) {        //Kunal's code
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
}

















