package course.BinarySearch;

public class ceilingFloorValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8};
        int target = 4;

        System.out.println(ceiling(arr, target)); //give the index of answer
        System.out.println(floor(arr, target));

//        System.out.println(arr[ceiling(arr, target)]);
//        System.out.println(arr[floor(arr, target)]);

    }

    static int ceiling (int[] arr, int target){

        if (target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;

    }

    static int floor (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;

    }
}
