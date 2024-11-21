package course.Recursion.Subsets;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");

        System.out.println(permutations2("", "abc"));

        System.out.println(permutationscount("", "abc "));
    }


    /* in order to convert permutation to iteration we will need queue
    * for sliding window and 2pointer we will need heaps and hashmaps*/

    // p = prossesed string, up = unprossesed string
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int n = p.length();

        for (int i = 0; i <= n; i++){
            String first = p.substring(0,i);
            String second = p.substring(i,n);

            permutations(first + ch + second, up.substring(1));
        }
    }



    static ArrayList<String> permutations2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        int n = p.length();

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= n; i++){
            String first = p.substring(0,i);
            String second = p.substring(i,n);

            ans.addAll(permutations2(first + ch + second, up.substring(1)));
        }

        return ans;
    }



    //return count
    static int permutationscount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;

        char ch = up.charAt(0);
        int n = p.length();

        for (int i = 0; i <= n; i++){
            String first = p.substring(0,i);
            String second = p.substring(i,n);

            count = count + permutationscount(first + ch + second, up.substring(1));
        }

        return count;
    }
}
