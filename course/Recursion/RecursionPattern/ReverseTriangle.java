package course.Recursion.RecursionPattern;

public class ReverseTriangle {
    public static void main(String[] args) {
        revtri(5);
        revtriangle(5,0);
        triangle(5,0);
//        tri(5);
    }

    //kunals solution
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle(r, c+1);
            System.out.print("*");
        } else {
            triangle(r-1, 0);
            System.out.println();
        }
    }

    //kunals solution
    static void revtriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            revtriangle(r, c+1);
        } else {
            System.out.println();
            revtriangle(r-1, 0);
        }
    }


    static void revtri(int n){
        if (n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        revtri(n-1);
    }



    static int m = 1;
    static void tri(int n){
        if (m>n){
            return;
        }
        for (int i = 0; i < m; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        m = m+1;
        tri(m);
    }
}
