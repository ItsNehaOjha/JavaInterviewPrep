package day_06;

public class CheckSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,3,4,1,3,2,7};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[]arr, int index){
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr, index+1);
    }
}
