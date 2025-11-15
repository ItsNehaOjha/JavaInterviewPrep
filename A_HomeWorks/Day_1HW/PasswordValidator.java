package A_HomeWorks.Day_1HW;

public class PasswordValidator {
    //system.console se password hide krna hai

    // use krna h regular expressions
    // cheat sheet of RE
    // reg exp java cheatsheet
    // regular exp for password validation
    public static void main(String[] args) {
        String password = "Abc@1234";
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

        // reading the reg exp : regex means
        // ^ asserts position at the start of a line
        // (?=.*[0-9]) ensures at least one digit
        // (?=.*[a-z]) ensures at least one lowercase letter
        // (?=.*[A-Z]) ensures at least one uppercase letter
        // (?=.*[@#$%^&+=]) ensures at least one special character
        // (?=\\S+$) ensures no whitespace
        // .{8,20}$ ensures length is between 8 and 20 characters
        // (?=.*[0-9]) isme ek digit honi hi chahiye ye kese pta chal rha ?n
        // is regex ka matlab hai ki agar password me koi digit nahi hai to ye match nahi karega
        if (password.matches(regex)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
