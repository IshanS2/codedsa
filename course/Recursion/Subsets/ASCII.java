package course.Recursion.Subsets;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        subASCII("abc", "");

        System.out.println(AsciiRet("abc", ""));
    }

    static void subASCII(String s, String up){
        if (s.isEmpty()){
            System.out.println(up);
            return;
        }

        char ch = s.charAt(0);
        subASCII(s.substring(1), up + ch);
        subASCII(s.substring(1), up);
        subASCII(s.substring(1), up + (ch+0));
    }

    static ArrayList<String> AsciiRet(String s, String up){
        if (s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        char ch = s.charAt(0);
        ArrayList<String> first = AsciiRet(s.substring(1), up + ch);
        ArrayList<String> second = AsciiRet(s.substring(1), up);
        ArrayList<String> third = AsciiRet(s.substring(1), up + (ch+0));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
