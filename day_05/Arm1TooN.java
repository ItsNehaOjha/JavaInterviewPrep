package day_05;

public class Arm1TooN {
    public static void main(String[] args) {
        System.out.println(countArmStrong(10000));
    }
    static int countArmStrong(int n) {
        return countArmHelper(1, n);
    }
    static int countArmHelper(int current, int n) {
        if (current > n) {
            return 0;
        }
        int count = isArmstrong(current) ? 1 : 0;
        return count + countArmHelper(current + 1, n);
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
    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * power(num, pow - 1);
    } 
}
