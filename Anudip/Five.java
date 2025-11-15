package Anudip;

public class Five implements Runnable {



    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " step " + i);
            try {
                Thread.sleep(1000); // pause to make thread switching visible
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished!");
    }

    public static void main(String[] args) {

        //me chahti hun ki join ka use krke sabse pehle alpha hi chale phir beta phir gamma 



        System.out.println("Main thread started: " + Thread.currentThread().getName());

        Five obj = new Five();

        // Create threads with custom names
        Thread t1 = new Thread(obj, "alpha");
        Thread t2 = new Thread(obj, "beta");
        Thread t3 = new Thread(obj, "gamma");


        // Start threads
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        
        t3.start();

        System.out.println("Main thread is continuing its own work...");
    }
}