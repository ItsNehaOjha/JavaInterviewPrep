package A_HomeWorks.Day_4HW;

public class BinToDec {
    public static void main(String[] args) {
        int n = 100101;
        int num = n;
        int cnt = 0;
        while(n>0){
            cnt++;
            n/=10;
        }
        int ans =0;
        binToDec(num, cnt, ans);
        
    }
    static void binToDec(int num, int cnt,int ans){
        
        if(cnt == 0){
            ans+=1;
            System.out.println(ans);
            return;
        }
        int c = cnt -1;
        int dig = num/(int)Math.pow(10, c);
        ans+= dig * (int)Math.pow(2, c);


        binToDec(num%(int)Math.pow(10, cnt-1), cnt-1, ans);
    }
}
