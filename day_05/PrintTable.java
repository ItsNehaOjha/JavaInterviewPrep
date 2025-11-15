package day_05;

public class PrintTable {
    // public static void main(String[] args) {
    //     printTable(5, 10);
    // }
    // static void printTable(int n, int range){
    //     if(range == 0){
    //         return;
    //     }
        
    //     printTable(n, range-1);
    //     // yha per ye fayeda h ki girte hue ho rha h na ki uper jate hue 
    //     System.out.println(n + "X" + range + "= " + n*range);
    // }

    
    // public static void main(String[] args) {
    //     printTable(5, 10, "");
    // }
    // static void printTable(int n, int range, String res){
    //     if(range == 0){
    //         System.out.println(res);
    //         return;
    //     }
    //     String exp = n + "X" + range + "= " + n*range;
        
    //     printTable(n, range-1, exp+"\n" + res);
    //     // yha per ye fayeda h ki girte hue ho rha h na ki uper jate hue 
        
    // }

     public static void main(String[] args) {
        printTable(5, 10, "");
    }
    static void printTable(int n, int range, String res){
        if(range == 0){
            System.out.println(res);
            return;
        }
        String exp = n + "X" + range + "= " + n*range;
        
        printTable(n, range-1, res+  exp+"\n");   // yha per sirf res ko change kr diya position aur yha flow change ho gya 
        // yha per ye fayeda h ki girte hue ho rha h na ki uper jate hue 
    }
}
