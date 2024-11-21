package course.LinearSearch;

import java.util.Arrays;

public class linear2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {2,3,8,2},
                {3,4,5}
        };
        int x = 51;
        int[] ans = search(arr,x);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
    static int[] search(int[][] arr, int x){
        for (int r=0 ;r<arr.length; r++){
            for (int c=0; c<arr[r].length; c++){
                if (arr[r][c] == x){
                    return new int[]{r,c};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int r=0 ;r<arr.length; r++){
            for (int c=0; c<arr[r].length; c++){
                if (arr[r][c] > max ){
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}
