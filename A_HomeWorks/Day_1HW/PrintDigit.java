package A_HomeWorks.Day_1HW;

public class PrintDigit {
    public static void main(String[] args) {
        int num = 34512;
        int temp = num;
        int c = 0;
        while(num>=0){
            num/=10;
            c++;
        }   
        System.out.println(c);

       
    }
}
