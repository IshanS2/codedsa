package course.Backtracking.Maze;

import java.util.ArrayList;

public class PrintPaths {
    public static void main(String[] args) {
        path("", 3,3);

        System.out.println(pathret("", 3, 3));

        System.out.println(pathretDia("", 3, 3));
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if ( r > 1){
            path(p + 'D', r-1, c);
        }

        if (c > 1){
            path(p + 'R', r, c - 1);
        }

    }


    static ArrayList<String> pathret(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if ( r > 1){
            ans.addAll(pathret(p + 'D', r-1, c));
        }

        if (c > 1){
            ans.addAll(pathret(p + 'R', r, c - 1));
        }

        return ans;
    }


    //now you can move diagonally
    static ArrayList<String> pathretDia(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1){
            ans.addAll(pathretDia(p + 'D', r-1, c-1));
        }

        if ( r > 1){
            ans.addAll(pathretDia(p + 'V', r-1, c));
        }

        if (c > 1){
            ans.addAll(pathretDia(p + 'H', r, c - 1));
        }

        return ans;
    }
}
