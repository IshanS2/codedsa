package course.Recursion.RecursionLevel1;

public class Nto1 {
    public static void main(String[] args) {
        Nto1(5);
        onetoN (5);
        both(5);
        concept(5);
    }

    static void concept(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--); // this will generate stackoverflow error as it passes the value of n first and then subtract
        concept(--n); // this subtracts first and then pass the value of n

    }

    static void Nto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        Nto1(n-1);

        System.out.println();
    }

    static void onetoN(int n){
        if (n == 0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);

        System.out.println();
    }

    static void both(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
