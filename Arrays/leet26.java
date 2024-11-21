package Arrays;

import java.util.Arrays;

public class leet26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates2(nums));
        System.out.println(Arrays.toString(nums));
    }


    static int removeDuplicates2(int[] nums) {
        int left = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return left + 1;
    }

    static int removeDuplicates(int[] nums) {
        int count = 0;
        int i = 0;
        int j = i + 1;
        int k = 0;
        while(j<nums.length-1){
            while(nums[i] == nums[j]){
                count++;
                j++;
            }
            k++;
            nums[k] = nums[j];

            i = j;
            j++;
        }
        return count;
    }
}
