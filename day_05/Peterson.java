package day_05;
public class Peterson {
    public static void main(String[] args) {
        peterson(145, 0, 145);

        int num = 100;
        int org = num;
        int r = peterson(145,org);
        if(org == r){
            System.out.println("peterson");
        }else{
            System.out.println("not");
        }
    }
    static void peterson(int n, int sum, int org){
        if(n ==0){
            // if(sum == org){
            //    System.out.println("peterson");
            // }else{
            //     System.out.println("not");
            // }

            System.out.println(sum == org ? "Peterson " : " Not Peterson ");
            return; 
        }
        int dig = n%10;
        int initSum = sum + fact(dig);
        peterson(n/10, initSum,  org);
    }
    static int fact(int n){
        if(n ==1  || n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
    static int peterson(int n, int org){
        if(n == 0){
            return 0;
        }
        int sum = peterson(n/10, org);
        return sum + fact(n%10);
    }
    
}
