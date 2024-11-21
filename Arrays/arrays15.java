package Arrays;

import java.util.Arrays;

public class arrays15 {
    public static void main(String[] args) {
        // create an array
        int[] nums = { 1, 1, 1, 2, 2, 6 };
//        change(arr);
        int k = removeDuplicates(nums);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Integer.toString(k));
    }

//    static void change(int[] nums) {
//        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be
//                      // changed
//        // so you cannot change strings but can change global value of arrays from
//        // functions as strings are immutable in java or final classes
//    }
    public static int removeDuplicates(int[] nums) {
        int[] array1 = new int[nums.length];
        int l = 0;
        int i = 0, j = i+1;
        while(i<nums.length){
            while (i!=nums.length-1 && nums[i] == nums[j]){
                nums[j] = 99;
                j++;

            }
            array1[l] = nums[i];
            l++;
            i = j;
            j = i+1;
        }
        for (i=0;i<array1.length;i++){
            nums[i]=array1[i];
        }
        int k = 0;
        while(nums[k] != nums[k+1]){
            k++;
        }

        return k;
    }
}
