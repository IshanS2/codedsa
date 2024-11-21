package Arrays;

public class StringLibrary {
    public static void main(String[] args) {
        String[] str = {"mactuber","youtuber"};
        String st = "youtuber";

        System.out.println(lib(str, st));
    }

    static String lib(String[] str, String st){
        int index = 0;
        int max = 0;

        for (int j = 0; j < str.length; j++) {
            int count = 0;
            int minLength = Math.min(str[j].length(), st.length());
            for (int i = 0; i < minLength; i++){
                if(str[j].charAt(i) == st.charAt(i)){
                    count++;
                }
            }
            if (count>max){
                max = count;
                index = j;
            }
        }
        return str[index];
    }
}

