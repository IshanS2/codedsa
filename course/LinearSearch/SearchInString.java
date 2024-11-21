package course.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "ishan";
        char target = 's';
        System.out.println(Search(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search2(String str, char target){   //we can rename string name as str as it is pass by value
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch){
                return true;
            }
        }
        return false;
    }


    static boolean Search(String str, char target){   //we can rename string name as str as it is pass by value
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
