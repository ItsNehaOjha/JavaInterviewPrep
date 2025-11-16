package A_HomeWorks.Day_1HW;

public class FindOutSumOfDigit {
    public static void main(String[] args) {
        int n=12345;

        int ans = 0;
        while(n>0){
           int dig = n%10;
           ans+=dig;
           n/= 10;
        }
        System.out.println(ans);
    
    }
}
