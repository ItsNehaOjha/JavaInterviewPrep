package day_01;

public class InputDemo {
    public static void main(String[] args) {
        //+ = addition and concate the string 
        // 1 command line input
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
