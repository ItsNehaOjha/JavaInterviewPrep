package A_HomeWorks.Day_1HW;

import java.util.Arrays;

public class Prime1toN {
    // public static void main(String[] args) {
    //     // ek tarika h ki ya to me 2 loop krlun 1 se n tak ke primes pta krne ke liye 
    //     int n = 7;       
    //     int cnt =0;   
    //     for(int i=2;i<=n;i++){
    //         int fact =0;
    //         for(int j =1;j<=i;j++){
    //             if(i%j == 0){
    //                 fact++;
    //             }
    //         }
    //         if(fact<=2){
    //             cnt++;
    //             System.out.print(i + " ");
    //         }
            
    //     }
    //     System.out.println("");
    //     System.out.println("cnt : "+cnt);


    //     // ya fir hm do functions ka use krke bhi kr skte h 
    // }


        //dusara tarika h :-  seiveOfEratosthenes(30); for better complexity 

        // isme hm ek array bna lete h n tak aur initally sabme true  dalte h , fir fir let say hmara n 2 h to
        // jitne bhi 2 ke multiple honge unko false kr denge aur similarly n tak sare number ke factor ko khatam krte jayenge isse complexity reduce ho jayegi


    public static void main(String[] args) {
        int n=10;
        boolean isPrime[] = new boolean[n];
        int cnt =0;
        Arrays.fill(isPrime, true);
        for(int i =2;i< n; i++){
            if(isPrime[i] == true){
                cnt++;
                for(int j=2; i*j<n;j++){
                    isPrime[i*j]= false;
                }
            }
        }
        
        System.out.println(cnt);
    }

}
