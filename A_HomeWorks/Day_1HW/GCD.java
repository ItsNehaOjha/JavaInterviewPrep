package A_HomeWorks.Day_1HW;

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b=18;
        int min = (a<b)?a:b;
        int gcd =1;
        int i=1;
        while(i <= min){

            if(a%i == 0 && b%i == 0){

                gcd = i;
            }
            i++;
        }
        System.out.println(gcd);
    }
}
