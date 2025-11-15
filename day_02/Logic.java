package day_02;

public class Logic {
    // for aur while e diffrence 
    // start aur end pta h = for
    // agar end aur start nhi pta h , condition ke basis pe chalna h = while 


    // prime number
    // int i =10;
    // int fact= 0;
    // for(int j = 1;i<i;i++){ // no good for long number 
    //     if(i%j == 0){
    //         fact++;
    //         if(fact>=2){
    //             System.out.println("");
    //         }
    //     }
    // }


    public static void main(String[] args) {
        // int num = 23456789;
        // int fact = 0;
        // double power = Math.pow(num, 0.5);
        // for(int i=1; i*i<=num;i++){

        // }

        // homework ->1 leetcode count prime 204

        // 2 print digit 
        // 3 swap first and last digit of a number 

        int num = 12234;
        int temp = num;
        int cnt = 0;
        // COUNT SIZE 
        while(num>=0){
            num/=10;
            cnt++;
        }
        System.out.println(cnt);
        num = temp;
        // print digit
        
        while(num>=0){
            int pow =(int) Math.pow(10, cnt-1);
            num = temp;
            int fD = num/pow;
            System.out.println(fD);
            num %= pow;// remove first digit 
            pow/=10;

        }
    
    }
}
