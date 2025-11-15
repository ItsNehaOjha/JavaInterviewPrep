package question_50;

import java.util.Scanner;

public class PerfectSq {
    public static void main(String[] args) {
        // Given n, print all numbers between 1–n that have an odd number of divisors.

        // find the perfect squeare till n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inp = sc.nextInt();
        
        for(int i=1;i *i<=inp;i++){
           System.out.print(i*i + " ");
        }
        sc.close(); 
    }
}
