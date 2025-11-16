package A_HomeWorks.Day_4HW;

public class CountEvenOddInRange {
    public static void main(String[] args) {
        // count even odd from 1 to N
        cntEvenOdd(100, 0 , 0);

    }

    // jitne bhi void wale method hote h unme bante hue stack kam krta h girte hue nhi
    static void cntEvenOdd(int range, int evenCount, int oddCount){

        if(range == 0){
            System.out.println("evenCount: "+ evenCount);
            System.out.println("oddCount: "+ oddCount);
            return;
        };

        if(range%2 == 0){
            evenCount++;
        }else{
            oddCount++;
        }
        cntEvenOdd(range - 1,evenCount , oddCount);
    }
}
