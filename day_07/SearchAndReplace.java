package day_07;



public class SearchAndReplace {
    public static void main(String[] args) {
        String res = searchAndRep("Hello", 'l',  'x');
        System.out.println(res);
    }
    static String searchAndRep(String s, char search, char replace){
        return helper(s, search, replace, 0);
    }

    static String helper(String s, char find, char rep, int i){
        if(i == s.length()) return "";
        char ch = s.charAt(i);
        char replaced = (ch == find) ? rep : ch;
        return replaced + helper(s, find, rep, i + 1);
    }
}


