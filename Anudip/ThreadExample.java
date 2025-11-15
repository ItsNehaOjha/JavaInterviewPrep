package Anudip;

public class ThreadExample {
    //CPU-> start some process -> process ko chhote chhote part me divide krke alag alag thread me divide krdega -> har thread ek sath execute hoga -> jisse ki process jaldi complete ho jayega
    // multithreading -> ek sath multiple thread execute ho rahe hai
    //why extends is used and why implements specific reason->
    // extends is used to inherit the properties and methods of a class
    // implements is used to implement the methods of an interface
    //matlab hum ek class se sirf ek hi class inherit kr skte hai but hum ek se jyada interface ko implement kr skte hai
    // Thread class Lang package me hota hai isliye humne yaha pe import nhi kiya hai

    // public static void main(String[] args) {
    //     System.out.println(Thread.currentThread().getName());
    //     // iska mtlb hai ki hum current thread ka name print kr rahe hai
    //     // isse hume ye pata chalta hai ki abhi kaunsa thread execute ho raha hai
    //     MyThread t1 = new MyThread();
    //     t1.start(); 
    //     System.out.println("Main thread is running");



    // }
    // // nayi class bana ke usme Thread class ko extend krke run kr skte hai
    // public static class MyThread extends Thread {
    //     @Override
    //     public void run() {
            
    //         for(int i=0;i<1000;i++){
    //             System.out.println("MyThread is running");
    //         }
    //     }   
    // }
    


    // public class World extends Thread {
    //     @Override
    //     public void run(){
    //         for(int i=0;i<1000;i++){
    //             System.out.println(Thread.currentThread().getName());
    //         }
    //     }

    // }

}
