package A_HomeWorks.Day_1HW;

// reverse of a number of leetcode

// armstrong number



public class EvenAndOddPlaceSumOfDigit {
    public static void main(String[] args) {
        int num = 8765;
        int n = num;
        int c =0;
        while(num>0){
            c++;
            num/=10;
        }
        System.out.println(c);
        int even =0;
        int odd = 0;
        while(c>0){
            int dig = n %10;
            if(c%2 == 0){
                odd+= dig;
            }else{               
                even += dig;
            }
            c--;
            n/=10;
        }
        System.out.println("even: "+ even);
        System.out.println("odd: "+ odd);

    }
}
