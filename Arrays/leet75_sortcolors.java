package Arrays;
import java.util.Arrays;

public class leet75_sortcolors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int k = 0;
        while(k<3){
            int i = 0, j = i;
            while (nums[i] < k){
                i++;
                j = i;
            }
            while (j<nums.length){
                if(nums[j] == k){
                    swap(nums, i, j);
                    i++;
                    j = i;
                } else {
                    j++;
                }
            }
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }

        static int[] swap(int[] arr, int a, int b){
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;

            return arr;
        }

}
