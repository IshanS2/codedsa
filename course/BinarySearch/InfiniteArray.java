package course.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1)*2;
            start = newStart;

        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){

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

}
