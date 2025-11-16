package A_HomeWorks.Day_1HW;

public class FindFrequencyOfEachDigitInANumber {
    public static void main(String[] args) {
        // Find frequency of each digit in a number  using hashing or array
        
        // For example, for the number 1223334444
        // 1 occurs 1 time
        // 2 occurs 2 times
        // 3 occurs 3 times
        // 4 occurs 4 times
        int[] hashfreq = new int[10];
        int n = 1223334444;
        
        while(n>0){
            int dig = n%10;
            hashfreq[dig]++;  //
            n/=10;
        }

        for(int i=0; i<10; i++){
            if(hashfreq[i] > 0){
                System.out.println(i + " occurs " + hashfreq[i] + " times");
            }
        }


    }
}
