package day_02;

import java.util.Scanner;

public class InputDemo2 {
    // ek .read method hota h jo input leta h
    // uske liye exception handle karna padta h
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Enter your name: ");
    //     int name = System.in.read();
    //     System.out.println("You entered: " + (char)name);
    // }
    // BufferedReader class use karte h
    // import java.io.BufferedReader;


    //scanner ek buffer hota 

    public static void main(String[] args) {
        // Scanner class use karte h
        Scanner scanner = new Scanner("Neha ojha 25 55000.50");  // here scanner is reference variable 
        int cnt = 0;
        while (scanner.hasNext()) {
            cnt++;
            System.out.println("Input " + cnt + ": " + scanner.next());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // nextLine() method use karte h string input lene ke liye, tab tak input lo jab tak enter na press ho
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // nextInt() method use karte h integer input lene ke liye 
        System.out.println(name + " " + age );

        // yhi per agar name aur id ka sequence change kr dun to glich aayega ki next enter jo kha jayega
        // isliye hamesha input lene se pehle prompt de dena chahiye

        // jab bhi next lete h space ya enter tak ka input leta h
        // agar nextLine() use karte h to pura line le leta h space samet


        // conclusion-> hamesha input lene se pehle prompt de dena chahiye

        // scanner close nhi kiya to memory leak ho sakta h
        scanner.close();
        sc.close();


        // agar scanner ek bar band kr diya to dubara use nhi kar sakte

        // isliye hamesha input lene se pehle prompt de dena chahiye

        // ek shorthand hota h : java filename.java ye behind the scene compile krke bytecode banata h aur ye single file ke liye hi hota h
        // agar multiple files h to uske liye ek alag command hoti h javac filename.java

    }
}
