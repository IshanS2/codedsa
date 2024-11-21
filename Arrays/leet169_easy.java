package Arrays;
import java.util.Arrays;

public class leet169_easy {
    public static void main(String[] args) {
        int nums[] = {3,3,4};
        majorityElement(nums);
    }

//    Approach 3: Moore Voting Algorithm
//    Intuition:
//    The intuition behind the Moore's Voting Algorithm is based on the fact that if there is a majority element in an array, it will always remain in the lead, even after encountering other elements.
//
//    Algorithm:
//    1. Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value.
//    2. Iterate through the array nums:
//       a. If count is 0, assign the current element as the new candidate and increment count by 1.
//       b. If the current element is the same as the candidate, increment count by 1.
//       c. If the current element is different from the candidate, decrement count by 1.
//    3. After the iteration, the candidate variable will hold the majority element.

//    Explanation:
//    1. The algorithm starts by assuming the first element as the majority candidate and sets the count to 1.
//    2. As it iterates through the array, it compares each element with the candidate:
//       a. If the current element matches the candidate, it suggests that it reinforces the majority element because it appears again. Therefore, the count is incremented by 1.
//       b. If the current element is different from the candidate, it suggests that there might be an equal number of occurrences of the majority element and other elements. Therefore, the count is decremented by 1.
//      Note that decrementing the count doesn't change the fact that the majority element occurs more than n/2 times.
//    3. If the count becomes 0, it means that the current candidate is no longer a potential majority element. In this case, a new candidate is chosen from the remaining elements.
//    4. The algorithm continues this process until it has traversed the entire array.
//    5. The final value of the candidate variable will hold the majority element.

    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }


//    this was my wrong solution using freq array
    static int majorityElementMY(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        // int max = Collections.max(Arrays.asList(nums));
        System.out.println(max);

        int[] arr = new int[max+1];

        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        int index = 0, maxn = 0;

        for(int j=0; j<arr.length; j++){
            if (arr[j] > maxn){
                max = arr[j];
                index = j;
            }
        }

        return index;
    }
}
