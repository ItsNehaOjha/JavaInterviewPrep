package day_02;

public class HW1 {
    public static void main(String[] args) {
        // swap first and last digit of a number
        int n = 2228889;
        int temp = n;
        int last = n%10;
        // for first need to count the digits 
        int cnt =0;
        while(n>0){
            cnt++;
            n/=10;
        }
        System.out.println("Count = "+ cnt);
        n = temp;

        int Onezero = (int)Math.pow(10, cnt -1);
        int first = n/Onezero;

        int mid =( (n - first*Onezero ) - last);
        int newNumber  = last*Onezero + mid + first;
        System.out.println(newNumber);

    }
}
