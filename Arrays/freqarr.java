package Arrays;
import java.util.Arrays;

public class freqarr {
    public static void main(String[] args) {
        int[] arr = {1,6,7,5,4,2};
        int n = maxx(arr);
        int[] ans = new int[n];

        for (int i=1 ; i<arr.length ; i++){
            ans[i]++;
        }

        System.out.println(Arrays.toString(ans));
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
}
