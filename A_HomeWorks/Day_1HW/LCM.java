package A_HomeWorks.Day_1HW;

public class LCM {
    public static void main(String[] args) {
        int a =4;
        int b = 6;
        int max = (a>b)?a:b;
        System.out.println(max);
        int ans = 0;
        while(true){
            if(max%a ==0 && max%b == 0){
                ans = max;
                System.out.println(ans);
                break;
            }else{
                max+= 1;
            }
        }
        
        
    }
}
