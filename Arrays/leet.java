package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class leet {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        List<Integer> duplicates = findDisappearedNumbers(nums);
//        System.out.println(duplicates);
        System.out.println(Arrays.toString(findDisappearedNumbers(nums)));

    }
    static int maxx (int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = maxx(nums);
        int[] arr = new int[n+1];

        for (int i=1 ; i<nums.length ; i++){
            arr[i]++;
        }
        for (int i : arr){
            if(arr[i] == 0){
                ans.add(i);
            }
        }
        return arr;
    }
}





