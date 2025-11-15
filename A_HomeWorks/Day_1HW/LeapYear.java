package A_HomeWorks.Day_1HW;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1600;
        if(year % 4 == 0){
            if(year % 100 == 0){
                System.out.println("Not leap");
            }else{
                System.out.println("Leap year");
            }
        }else{
            System.out.println("leap");
        }
    }
}
