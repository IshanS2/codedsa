package course.Recursion.RecursionLevel1;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }

    static boolean palin(int n){
        return n == rev(n);
    }

    static int rev(int n){  //kunal's method-2 which uses only recursion
        //sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if((n%10) == 0){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    //without the rev function
    // use another helper fuction which takes fun(n, start, end)
    //this will check if the values are equal or not for start and end
    //you can use array or string for this
}
