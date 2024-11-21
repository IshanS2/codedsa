package course.LinearSearch;

import java.util.Arrays;

public class leetcode1672wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,4}
        };
        System.out.println(maximumWealth(accounts));
        System.out.println(Arrays.toString(maximumWealth(accounts)));
    }
    static int[] maximumWealth(int[][] accounts) {
        int[] balance = new int[accounts.length];
        int x = 0;
        for (int customer = 0; customer<accounts.length; customer++){
            for (int account = 0; account<accounts[customer].length; account++){
                x += accounts[customer][account];
            }
            balance[customer] = x;
            x=0;
        }
        return new int[]{max(balance)};
    }
    static int max(int[] balance){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<balance.length; i++){
            if (balance[i] > max){
                max = balance[i];
            }
        }
        return max;
    }
}
