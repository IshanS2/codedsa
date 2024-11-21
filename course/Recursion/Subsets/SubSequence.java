package course.Recursion.Subsets;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        sub(s, "");

        ArrayList<String> list = sublist(s, "");
        System.out.println(list);

        System.out.println(sublist(s, ""));
    }

    static void sub(String s, String up){                // here up = processed string and s = unprocessed
        if (s.isEmpty()){
            System.out.println(up);
            return;
        }

        char ch = s.charAt(0);
        sub(s.substring(1), up + ch);
        sub(s.substring(1), up);

    }


    static ArrayList<String> sublist(String s, String up){
        if (s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        char ch = s.charAt(0);
        ArrayList<String> left = sublist(s.substring(1), up + ch);
        ArrayList<String> right = sublist(s.substring(1), up);

        left.addAll(right);
        return left;
    }
}
