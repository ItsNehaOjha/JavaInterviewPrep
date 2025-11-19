package day_07;

public class StringRev {
    public static void main(String[] args) {
        String rev = reverse("neha");
        System.out.println(rev);

        // by two pointer approach
        String str = "neha";
        // String revTP = reverseTP( str.toCharArray(), 0, str.length()-1);
        System.out.println(revTP);
    }
    static String reverse(String str){
        if(str.length()==0){
            // kabhi bhi main string me nhi kr skte to hme nyi string bnani pdegi kyuki string immutable hota h
            return ""; // blank 
        }
       
        // make string small
        // String oldResult = reverse(str.substring(1));
        // char newRes = str.charAt(0);
        // return oldResult + newRes;

        return reverse(str.substring(1)+ str.charAt(0));
    }

    // applying two pointer approach to reverse string 
    // static String reverseTP(StrictMath)
}
