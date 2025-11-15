package Anudip;

// ek hi class me ek main thread aur ek aur method run jisme jo bahar ki class h uska alag thread 
public class CompleteProgram extends Thread{
     public void run(){
        System.out.println("Running  myThread");
        try{
            Thread.sleep(2000); // jo bhi current method ke ander ka thread h use sleep krdo
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        CompleteProgram t1 = new CompleteProgram();
        System.out.println(t1.getState());
        t1.start();  // jese hi thread start hota h tab JVM thread ka run method chala deta h 
        System.out.println(t1.getState());
        Thread.sleep(400);  // main thread ko sulaya mene 400ms ke liye bas
        System.out.println(t1.getState());

        // ab ek method hota h join
        // join ka kam hota h jis thread ke liye call krre h us thread ke die hone ka wait krta h pehle uske bad hi jis method me call kiye h uska thread chalta h 
        // jese yha agar mene uper ka t1 thread pe join lgaya to jab pure 2 second ke bad t1 thread die ho jayega tab hi main thread chalega 
        // in simple words join waits for the thread on which it is calling too die first then the thread of the current method will execute
        //  or t1.join means caller of the thread i.e. main method will wait for t1 to fininsh first 

        t1.join();  // jab tak pure 2 sec ka t1 chalge pura chalne denge uske bad hi main thread chalega
        System.out.println(t1.getState());  // pure 2 second ke bad btaya terminated 
        System.out.println(Thread.currentThread().getState()); 
    }
}



// kab extends thread use  krna h kab implement runnable krna pdega
// jab hm already koi class extent krre honge jese: class A extends B -> is case me hm B, Thread nhi likh skte since multiple inheritance nhi hota 
// isiliye is case me hme implements runnable krna pdega 