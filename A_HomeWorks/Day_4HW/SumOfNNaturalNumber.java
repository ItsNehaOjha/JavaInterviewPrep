package A_HomeWorks.Day_4HW;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        // without formula
        int n = 10;
        int ans = 0;
        sum(n, ans);
    }
    static void sum(int n, int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        sum(n-1,ans+=n);
    }
}
