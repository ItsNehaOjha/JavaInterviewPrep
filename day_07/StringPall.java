package day_07;

public class StringPall {
    public static void main(String[] args) {
        System.out.println(isPallindrome("ab"));
    }
    static boolean isPallindrome(String s){
        return helper( s.toLowerCase(), 0, s.length()-1);
    }
    static boolean helper(String s, int l, int r){
        if(l>=r) return true;

      
        if(s.charAt(l) == s.charAt(r)) {
            return false;
        }
        return helper(s, l+1, r-1);
    }
}
