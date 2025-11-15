package day_04;

public class Recursion {
    // return ke bad uske pas jate h jisne usko bulaya
    // recursion extra memory leta h stack (history ) maintain krta h 
    // har state ya n ki value store rehti h recursion me  
    // recursion state remember rakhta h isiliye immutable hota h lekin loop mutable hota h kyuki isme state remember nhi rehta h 

    public static void main(String[] args) {
        fact(5,1);

        
    }
    // factorial of a number
    static void fact(int num, int result){
        // small problem
        if(num==1){
            System.out.println(result);
            return;
        }

        fact(num-1, result*num);
    }
}
