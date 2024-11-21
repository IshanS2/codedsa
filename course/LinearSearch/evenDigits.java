package course.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnums(nums));
        System.out.println(digits2(-66456));
    }

    static int findnums(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // chech if a number is even
    static boolean even (int num){
        int numofdigit = digits(num);
        /*
        if (numofdigit % 2 == 0){
            return true;
            }
        */
        return numofdigit % 2 == 0;
    }

//    static boolean isEven(int num)
//    {
//        // n & 1 is 1, then odd, else even
//        return (!(num & 1));
//    }

    //shortcut to find no. of digits
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    //counts the no. of digits in a number
    static int digits(int num){

          if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num /10;
        }
        return count;
    }
}
