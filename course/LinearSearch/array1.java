package course.LinearSearch;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,66,344};
        System.out.println(Max(arr));
        System.out.println(MaxRange(arr,1,3));
        reverse(arr);
    }
//    static int Max(int[] arr){
//        int m = 0;
//        for (int i=0; i<arr.length - 1; i++){
//            m = arr[i];
//            if (arr[i] < arr[i+1])
//                m = arr[i+1];
//        }
//        return m;
//    }

    static int Max(int[] arr){

        if (arr.length == 0){ //Edge case
            return -1;
        }
        int m = arr[0];
        for (int i=1; i < arr.length; i++){
            if (arr[i] > m)
                m = arr[i];
        }
        return m;
    }

    static int MaxRange(int[] arr, int start, int end){

        if (end > start){    //Edge cases
            return -1;
        }
        if (arr == null){
            return -1;
        }

        int m = arr[start];
        for (int i=start; i <= end; i++){
            if (arr[i] > m)
                m = arr[i];
        }
        return m;
    }

    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}


