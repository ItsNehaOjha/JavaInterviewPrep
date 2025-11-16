package A_HomeWorks.Day_1HW;

public class PrintDigit {
    public static void main(String[] args) {
        int num = 34512;
        System.out.println(num);
        int temp = num;
        int c = 0;
        while(num>0){
            num/=10;
            c++;
        }   
        
        int n = temp;
        
        while(n>0){
            int zero = (int)Math.pow(10, c-1);
            c = c-1;
            int dig = n / zero;
            System.out.println(dig);
            n=n%(int)Math.pow(10, c);

        }

       
    }
}
