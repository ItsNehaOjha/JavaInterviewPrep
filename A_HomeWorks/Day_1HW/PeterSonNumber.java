package A_HomeWorks.Day_1HW;

public class PeterSonNumber {
    public static void main(String[] args) {
        // Peter-son number
        // A number is said to be a Peter-son number if the sum of its digits is equal to the product of its digits.
        // For example, 123 is a Peter-son number because 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6.
        int n = 123;
        int temp = n;
        int sum = 0;
        int mul = 1;
        while(n>0){
            int dig = n%10;
            sum+=dig;
            mul*=dig;
            n/=10;
        }
        System.out.println("mul: " + mul);
        System.out.println("sum: "+ sum);
        if(mul == sum){
            System.out.println(temp +" is peterson");
        }else{
            System.out.println(temp +" is not peterson");
        }
    }
}
