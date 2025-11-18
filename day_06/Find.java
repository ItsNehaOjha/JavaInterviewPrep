package day_06;

public class Find {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 10, 100, 10};
        // mujhe ek arr dena h jisme jitne bhi 10 h is array me us size ka ho 
        int result[] = find(arr, 0, 10);
        for(int i: result){
            System.out.println(i);
        }
    }
    static int[] find(int[]arr, int index, int search){
       
        int noOfsearch  = helper(arr,search, 0); 
        if(index == arr.length){
            int[] res = new int[noOfsearch];
        }
        if(arr[index]== search){
            res[index] = 
        }


    }
    static int helper(int[] arr, int search, int ind){
        if(ind == arr.length-1){
            return 0;
        }
        int cnt = 0;
        if(arr[ind ] == 10){
            cnt++;
        }
        return cnt;
    }
}
