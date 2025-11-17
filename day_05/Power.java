package day_05;

public class Power {
    public static void main(String[] args) {
        // Calculate 2 to the power of 5 by recursion in void return type 

        power(2, 5, 1);
        int r = powerInIntReturnType(2, 5);
        System.out.println(r);
    }
    // prepare result in each call through void  == void me passing method chalta 
    static void power(int num, int pow, int result){
        if(pow == 0){
            System.out.println(result);  // time to print the result 
            return;
        }
        power(num, pow-1, result * num);
    }


    // isiko integer return type me 

    // return result - int type return value me girte time pe result dena 
    static int powerInIntReturnType(int num, int pow){
        if(pow == 0){
            // time to prepare result 
            return 1;// init result  // sirf wo code jo ek bar chalana ho wo code base case me likhte h 
        }
        int smRes = powerInIntReturnType(num, pow - 1);
        int res = smRes *num;
        return res;

        // 
    }


}
