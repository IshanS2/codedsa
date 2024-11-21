package Arrays;

public class leet774 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'f' ;
        System.out.println(nextGreatestLetter(letters,target));
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target)
                start = mid + 1 ;
            else
                end = mid ;
        }
        if (start >= n)
            return letters[0];

        return letters[start];
    }
}
