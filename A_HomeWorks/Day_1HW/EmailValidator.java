package A_HomeWorks.Day_1HW;

public class EmailValidator {
    public static void main(String[] args) {
        // reg ex of email validation
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String email1 = "";

        if (email1.matches(emailRegex)) {
            System.out.println(email1 + " is a valid email address.");
        } else {
            System.out.println(email1 + " is not a valid email address.");
        }
        
        
    }


}
