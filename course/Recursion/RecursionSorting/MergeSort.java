package course.Recursion.RecursionSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(MYmerge(arr1,arr2)));

        int[] arr = {5, 4, 3, 2 , 1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0 , mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<first.length && j<second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            i++;
        }

        return mix;
    }



    //My code fro merging two arrays
    static int[] MYmerge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(j<arr1.length && k<arr2.length){
            if(arr1[j] < arr2[k]){
                arr[i] = arr1[j];
                j++;
            } else {
                arr[i] = arr2[k];
                k++;
            }
            i++;
        }
        while(k<arr2.length){
            arr[i] = arr2[k];
            k++;
            i++;
        }
        while(j<arr1.length){
            arr[i] = arr1[j];
            j++;
            i++;
        }
        return arr;
    }
}
