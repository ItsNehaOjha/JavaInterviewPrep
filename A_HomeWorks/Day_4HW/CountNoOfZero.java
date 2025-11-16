package A_HomeWorks.Day_4HW;

public class CountNoOfZero {
    public static void main(String[] args) {
        int cnt = 0;
        noOfZero(1009, cnt);
        

    }
    static void noOfZero(int n, int cnt){
        if(n==0){
            System.out.println(cnt);
            return;
        };
        int dig = n%10;
        if(dig==0)cnt++;
        noOfZero(n/=10,cnt);
    }
}
