package Arrays;
import java.math.*;
import java.util.ArrayList;


public class factors {
    public static void main(String[] args) {
        factors(20);
        factors2(20);
    }

    static void factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() -1 ; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }
    }

    static void factors2(int n){
        System.out.println();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");

                }
            }
        }
    }
}
