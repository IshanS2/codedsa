package course.Recursion.RecursionLevel1;

public class reverseNo {
    public static void main(String[] args) {
        reverseMy(54321);
        System.out.println();
        rev1(54321);
        System.out.println(sum);
        System.out.println(rev2(54321));
    }

    static int sum = 0;
    static void rev1(int n){  //kunal's method-1 which uses a outside variable (sum)
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }


    static int rev2(int n){  //kunal's method-2 which uses only recursion
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


    static void reverseMy(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        reverseMy(n/10);
    }
}
