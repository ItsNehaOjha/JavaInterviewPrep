package day_02;

public class BreakOrContinue {
    public static void main(String[] args) {
        
        // break -> exit from the *current* loop
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(j==i) {
                    break; // inner loop will terminate when j is equal to i
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("----------");

        // loop aur iteration alag hain 
        // loop ek baar me multiple elements ko access karne ke liye hota hai
        // jabki iteration ek ek karke elements ko access karne ke liye hota hai


        // continue mtlb skip the current * iteration * and move to the next iteration


        // agar mene label use kr diya continue ke sath to wo current loop nahi balki us label wale loop ko continue karega
        outerLoop: for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if(j==i) {
                    continue outerLoop; // skip the rest of the current iteration of the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // ye bilkul jese break krta h kam karta h bas continue karta h
    }
}
