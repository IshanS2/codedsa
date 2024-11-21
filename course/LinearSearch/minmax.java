package course.LinearSearch;

public class minmax {
    public static void main(String[] args) {
        int[] arr = {13,14,3,25,33,4,2};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int m = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<m){
                m = arr[i];
            }
        }
        return m;
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int m = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }
}
