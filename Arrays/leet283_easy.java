package Arrays;
import java.util.Arrays;

public class leet283_easy {
    public static void main(String[] args) {
        int[] nums = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        int i = 0, j = i;
        while(j<nums.length){
            if(nums[j] > 0 || nums[j] < 0){
                swap(nums, i, j);
                i++;
                j = i;
            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
