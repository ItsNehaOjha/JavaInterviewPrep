package A_HomeWorks.Day_2HW;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
         for(int row = 0; row<= n;row++){
            for(int col = 0;col<=n;col++){
                if(row< n -col){
                    System.out.print("_");
                }
                if(row >= n-col){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
