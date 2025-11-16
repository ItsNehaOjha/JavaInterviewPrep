package A_HomeWorks.Day_4HW;

public class CountEvenOddDigInNumber {
    public static void main(String[] args) {
        
        int n = 12367;
        int even = 0;
        int odd = 0;
        count(n, even,odd);
    }
    static void count(int n, int even, int odd){
        if(n==0) {
            System.out.println("even: "+ even);
            System.out.println("odd: "+odd);
            return;
        }
        int dig = n%10;
        if(dig%2 == 0) {
            even += dig;
        }else{
            odd+=dig;
        }

        count(n/10, even, odd);
    }
}
