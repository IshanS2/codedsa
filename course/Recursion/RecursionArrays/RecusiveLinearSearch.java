package course.Recursion.RecursionArrays;

import java.util.ArrayList;

public class RecusiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,4,5};
        int target = 4 ;
        System.out.println(linear(arr,target,0));
        System.out.println(find(arr,target,0));
        System.out.println(linearFromLast(arr,target,arr.length - 1));

        findAllIndex(arr,target,0);
        System.out.println(list);

        System.out.println(findAllIndex2(arr,target,0,new ArrayList<>())); //OR you can just create a new arraylist in main and pass its name in function [ArrayList<Integer> list = new ArrayList<>();] [findallindex2(arr,target,0,list)]

        System.out.println(findAllIndex3(arr,target,0));
    }

    static int linear(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        } else {
            return linear(arr,target, index+1);
        }
    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    //iterate from the end
    static int linearFromLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else {
            return linearFromLast(arr,target, index - 1);
        }
    }

    //if a element occurs multiple times
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target, index+1);

    }

    // definign arraylist inside the parameters
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr,target, index+1, list);
    }


    //returning the arraylist without adding it to the parameter
    //making a new arrayList with each function call
    static ArrayList<Integer> findAllIndex3 (int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        //this will only contain the answer for that function call
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> findAllIndex3 = findAllIndex3(arr,target, index+1);

        list.addAll(findAllIndex3);

        return list;
    }
}
