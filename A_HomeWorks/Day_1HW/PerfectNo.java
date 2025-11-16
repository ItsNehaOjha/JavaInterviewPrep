package A_HomeWorks.Day_1HW;

public class PerfectNo {
    public static void main(String[] args) {
        // perfect no
        // number which is equal to sum of its proper divisors
        // 6 = 1 + 2 + 3
        int n = 10; 
        int ans = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                ans+=i;
            }
        }
        if(ans == n){
            System.out.println(n + " is a perfect number ");
        }else{
            System.out.println(n + " is not perfect number ");
        }
          
    }
    // real implementation of abstraction
    // mtlb jese do class h to dono me bat krni h to abstarction kese lgayenge
   // to hum interface ka use karenge

   // upcasting and downcasting inheritance me hota h

}
