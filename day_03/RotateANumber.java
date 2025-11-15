package day_03;

public class RotateANumber {
    public static void main(String[] args) {
        
        int n = 12345;
        int temp = n;
        int r = 2;
        
        int cnt = 0;
        while(n>0){
            cnt++;
            n/=10;
        }
        n=temp;
        r = r% cnt;// bring in the range 
        int last = n%((int)Math.pow(10, r));

        int rightPart = n / (int) Math.pow(10, r);

        
        System.out.println(last + "" + rightPart);


    }
}
