package course.Recursion;

import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceret("" , 4));

        diceface("", 6, 8);
        System.out.println(dicefaceret("", 8, 8));

    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target - i);
        }
    }


    static ArrayList<String> diceret(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceret(p+i, target - i));
        }
        return ans;
    }



    //dice has many faces
    static void diceface(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceface(p+i, target - i, face);
        }
    }


    static ArrayList<String> dicefaceret(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(dicefaceret(p+i, target - i, face));
        }
        return ans;
    }
}
