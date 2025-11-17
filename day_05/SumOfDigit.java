package day_05;

public class SumOfDigit {
    public static void main(String[] args) {
        // void type 
        sumOfDig(123, 0 );


        // int type 
        int r = sumOfDig(1235);
        System.out.println(r);
    }

    static void sumOfDig(int num, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        int dig = num%10;

        sumOfDig(num/10, sum+dig);

    }
    static int sumOfDig(int n){
        if(n == 0){
            return 0; // initial value of sum
        }
        // int sum = sumOfDig(n/10);
        // return sum + n %10;

        return sumOfDig(n/10 )+ n%10;  // pehle right side wali chiz operate hoti h uske bad left wali
       
    }
}
