package course.Patterns;

public class Halfpyramid {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern28(4);
        pattern30(4);
        pattern17(4);
        pattern31(4);
    }

    static void pattern1(int n){
        System.out.println("pattern1");
        for (int r = 1; r<=n ; r++){
            for (int c = 1; c<=r ; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        System.out.println("pattern2");
        for (int r = 1; r<=n ; r++){
            for (int c = 1; c<=n ; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        System.out.println("pattern3");
        for (int r = 1; r<=n ; r++){
            for (int c = r; c<=n ; c++){  // c=1;c<=n-r+1;
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        System.out.println("pattern4");
        for (int r = 1; r<=n ; r++){
            for (int c = 1; c<=r ; c++){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }

//    static void pattern5 (int n){
//        System.out.println("pattern5");
//        for (int r=1; r<=n; r++){
//            for (int c=1; c<=r; c++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        for (int r = 1; r<=n ; r++) {
//            for (int c = r; c <= n - 1; c++) {  // c=1;c<=n-r+1;
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern5 (int n){
        System.out.print("pattern 5 kunal's");
        for (int r=0; r< 2*n; r++){
            int totalcol = r > n ? 2 * n -r : r;
            for (int c =0; c < totalcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28 (int n){
        System.out.print("pattern 28 kunal's");
        for (int r=0; r< 2*n; r++){
            int totalcol = r > n ? 2 * n -r : r;

            int totalSpace = n - totalcol;
            for (int s=0; s < totalSpace; s++){
                System.out.print(" ");
            }
            for (int c =0; c < totalcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30 (int n){
        System.out.println("pattern 30 kunal's");
        for (int r=1; r<=n; r++){

            for (int s=0; s<n-r; s++){
                System.out.print("  ");
            }

            for (int c=r; c>=1; c--){
                System.out.print(c + " ");
            }

            for (int c=2; c<=r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern17 (int n){
        System.out.println("pattern 17 kunal's");
        for (int r=1; r<=2 * n; r++){

            int col = r > n ? 2 * n - r : r;

            for (int s=0; s<n-col; s++){
                System.out.print("  ");
            }

            for (int c=col; c>=1; c--){
                System.out.print(c + " ");
            }

            for (int c=2; c<=col; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern31 (int n){
        System.out.println("pattern 31 kunal's");
        int originalN = n;
        n = 2 * n;
        for (int r=0; r<=n; r++){
            for (int c=0; c<=n; c++){
                int atEveryIndex = Math.min(Math.min(r,c),Math.min(n-r, n-c));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

        System.out.println("Reaverse");
        for (int r=0; r<=n; r++){
            for (int c=0; c<=n; c++){
                int atEveryIndex = originalN - Math.min(Math.min(r,c),Math.min(n-r, n-c));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
