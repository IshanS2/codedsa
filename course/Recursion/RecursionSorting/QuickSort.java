package course.Recursion.RecursionSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quicksort(arr, 0 ,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;

        int p = s+(e-s)/2;

        while(s<=e){
            while(arr[s] < arr[p]){
                s++;
            }
            while(arr[e] > arr[p]){
                e--;
            }
            if (s <= e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }

        quicksort(arr,low,e);
        quicksort(arr,s,high);

    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
