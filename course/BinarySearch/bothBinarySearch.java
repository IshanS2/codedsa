package course.BinarySearch;

public class bothBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int target = 7;
        int ans = BinarySearch(arr,target);
        int ans2 = OrderAgnosticBS(arr1,target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int BinarySearch(int[] arr, int target){
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
        return -1;

    }


    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        Boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]){
                    start = mid + 1;
                }
            }


        }
        return -1;

    }
}
