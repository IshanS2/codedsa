package course.Recursion.RecursionStrings;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip("bbapplesd"));
        System.out.println(skipAppNotApple("bappbapplesd"));

    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}