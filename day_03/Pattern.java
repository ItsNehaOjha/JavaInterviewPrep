package day_03;

public class Pattern {
    
    // sabse pehle ek grid bnao and fill krlo usko
    public static void main(String[] args) {
        int n = 5;
        // *
        // **
        // ***
        // ****
        // yha grid me 1 se 1 tak fir 2 se 2 tak then 3 se 3 tak....
        // to pehla loop kese bhi bhi fix krdo ki grid bnana h
        
        
        // for(int row = 0; row<= n;row++){
        //     for(int col = 1;col<=n;col++){
        //         if(col <= row){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println(" ");
        // }


         //***** 
        // ****
        // ***
        // **
        // * 
        

        // to pehla loop kese bhi bhi fix krdo ki grid bnana h
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

        System.out.println(" ------------------------------------------------------");
 
        

        for(int row = 0; row<= n;row++){
            for(int col = 0;col<=n;col++){
                
                if(row<col ){
                    System.out.print("_");
                }
                if(row < n-col){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

    }
}
