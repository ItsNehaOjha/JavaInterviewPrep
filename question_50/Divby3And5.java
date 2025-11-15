package question_50;

public class Divby3And5 {
    public static void main(String[] args) {
        // Print all numbers from 1–100 that are divisible by both 3 and 5 but not by 2.
        for(int i=0;i<100;i++){
            if((i%3 == 0 && i%5==0) && i%2!=0){
                System.out.println(i);
            }
        }
    }
}
