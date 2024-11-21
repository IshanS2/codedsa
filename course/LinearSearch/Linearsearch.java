package course.LinearSearch;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,14,3,25,33,4,2};
        System.out.println("find which no.:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println(Search(arr,x));
        System.out.println(SearchinRange(arr, x, 1, 4));


    }

    static boolean Search3(int[] arr, int x){ //For boolean answer
        if (arr.length == 0){
            return false;
        }

        for (int ele : arr) {
            if (ele == x) {
                return true;
            }
        }
        return false;
    }

    static int Search2(int[] arr, int x){ //To return the element itself
        if (arr.length == 0){
            return -1;
        }

        for (int ele : arr) {
            if (ele == x) {
                return x;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int Search(int[] arr, int x){
        if (arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            int ele = arr[i];
            if(ele == x){
                return i;
            }
        }
        return -1;
    }

    static int SearchinRange(int[] arr, int x, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start;i<=end;i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
