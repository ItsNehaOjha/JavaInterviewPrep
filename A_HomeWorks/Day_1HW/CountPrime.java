package A_HomeWorks.Day_1HW;

public class CountPrime {
    public static void main(String[] args) {
        // using seive of Enathosthenes
        // works in log(log(n)) time complexity 
        int n=100;
        boolean prime[]=new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                count++;
            }
        }
        System.out.println("Number of prime numbers up to " + n + " is: " + count);
    }
}
