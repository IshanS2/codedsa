package course.Recursion.RecursionLevel1;

public class leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num) {
        return helper(num,0);
    }

    static int helper(int num,int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return helper(num/2,count+1);
        } else {
            return helper(num-1,count+1);
        }
    }
}
