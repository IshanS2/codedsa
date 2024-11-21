package course.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        int[] arr2 = {7,6,5,4,3,2,1,0};
        int target = 3;
        System.out.println(oabs(arr, target));
        System.out.println(oabs(arr2, target));
    }

    static int oabs(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start<=end){

            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else { end = mid - 1; }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else { start = mid+1 ; }

            }
        }
        return -1;

    }
}
