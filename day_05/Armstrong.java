package day_05;

public class Armstrong {
    public static void main(String[] args) {
        // armstrong bet 1 to n without usinf Math.pow function using two diffrent recursion method 1 by void and other by in return type 

        // signature :
        System.out.println(isArmstrong(153)? "Armstrong": "Not Armstrong");
    }
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int sum = calculateSum(num, digits);
        return sum == originalNum;
    }


    static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }


    static int calculateSum(int num, int digits) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return power(digit, digits) + calculateSum(num / 10, digits);
    }

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
}