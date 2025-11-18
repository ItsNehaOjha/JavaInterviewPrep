package day_06;

public class oundNotFound {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30,40,50};
        System.out.println(isFound(arr, 0,0)?"Found":"Not Found");
    }
    static boolean isFound(int[] arr, int index, int n){
        if(index ==  arr.length){
            return false;
        }
        if(arr[index]== n)return true;
        return isFound(arr,index+1, n); 
        
    }
}
