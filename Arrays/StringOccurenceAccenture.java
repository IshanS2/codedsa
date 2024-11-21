package Arrays;

public class StringOccurenceAccenture {
    public static void main(String[] args) {
        System.out.println(occur("ssshs", 5, "s"));
    }

    static int occur(String s, int len, String c){
        int count = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == c.charAt(0)){
                count++;
            }
        }
        return count;
    }
}
