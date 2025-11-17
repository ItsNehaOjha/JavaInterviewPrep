package A_HomeWorks.Day_5HW;

public class AgainArOfRange {
    public static void main(String[] args) {
        // armstrong from 1 to n
        System.out.println(countArmStrong(10000));
    }
    static int countArmStrong(int range){
        if(range==0){
            return 0;
        }
        int count = 0;
        if(isArmStrong(range))count++;
        count = count + countArmStrong(range - 1);
        return count;
    }
    static boolean isArmStrong(int n){
       if(n == 0)return false;

       int countDig = digCount(n, 0); // 3
       int sumOfPow = sumPow(n, countDig,0);
       if(sumOfPow == n) return true;
       return false;

    }
    static int digCount(int n, int cnt){
        if(n ==0) return 0;

        return (cnt+1) + digCount(n/10, cnt);
    }
    static int sumPow(int n, int pow,int sum){
        if(n==0)return 0;
        
        sum =  power(n%10, pow);

        return sum + sumPow(n/10, pow,sum);
    }
    static int power(int n , int pow){
        if(pow==0){
            return 1;
        }
        return n * power(n,pow-1);
    }

}
