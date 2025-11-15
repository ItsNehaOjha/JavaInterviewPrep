package question_50;

public class HarshedNo {
    // Given a number, check if it’s a Harshad number (sum of digits divides the number).

    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        int n = 18;
        int sum = 0;
        while(n>0){   // not equal Because then loop will not stop
            sum+= n%10;
            n=n/10;
        }
        System.out.println("sum is: "+ sum);

        // Count how many digits in a number are even.
        int  num = 123456;
        int cnt =0;
        while(num>0){
            int dig = num%10;
            if(dig%2==0){
                cnt++;
            }
            num = num/10;
        }
        System.out.println("count is: "+cnt);
     
        
    }
}
