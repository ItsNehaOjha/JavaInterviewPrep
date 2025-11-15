package day_04;

public class Pattern2 {
    public static void main(String[] args) {
        
        int n= 4;
        for(int r = 0; r<n;r++){
            for(int c = 0; c<n;c++){
                if(c<=n-r){
                    System.out.print(" ");
                }else{
                    System.out.print( "*");
                }
            }
            System.out.println();
        }
    }
}
