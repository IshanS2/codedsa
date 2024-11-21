package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        helper(nums,target, 0, ans);
        return ans;

    }

    static int[] helper(int[] nums, int target, int sum, int[] ans){
        if(nums.length == 0 && sum == target){
            return ans;
        }

        int ele = nums[0];

        if(ans[0] == 0){
            helper(Arrays.copyOfRange(nums,1 , nums.length-1), target, sum + ele , ans);
            helper(Arrays.copyOfRange(nums,1 , nums.length-1), target, sum, ans);
        } else {
            helper(Arrays.copyOfRange(nums,1 , nums.length-1), target, sum + ele , ans);
            helper(Arrays.copyOfRange(nums,1 , nums.length-1), target, sum, ans);
        }

        return new int[]{};
    }
}
