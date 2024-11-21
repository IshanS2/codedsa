package course.Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
//        int[] arr = {3,4,1,7,2};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if (!swapped){     //swapper == false so !swapped == true
                break;
            }
        }
    }




}
