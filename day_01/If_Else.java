package day_01;

import java.util.Scanner;

public class If_Else {
    // 3 numbers input lene h aur teeno me se bada number ko sa h lekin condition h ki nested if se hi krna h && ka use nhi krna h 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
        sc.close();
    }
}
