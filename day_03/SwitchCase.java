package day_03;

public class SwitchCase {
    public static void main(String[] args) {
        // switch case samjhao
        // if else kyu nhi lga skte switch qyu use krte hai
        // kyunki switch case me hum directly value ko match karte hain
        // jabki if else me hume condition likhni padti hai

        // menu driven application ke liye use hota h
        // switch case sabpe nhi jayega lekin if else sare cases me jaega ek ek krke
        // for eg :- 1,2,3,4,5,6,7
        // agar bhut bade sare h to if else me time jyada lagega
        // switch case me directly case pe jump kr jata h

        // restaurant system
        // good practive

        // switch case me bas int byte aur char hi use kr skte hain
        // java 7 se string bhi use kr skte hain
        
        final int PIZZA = 1;
        final int BURGER = 2;
        final int PASTA = 3;
        final int SALAD = 4;
        int choice = 3; // suppose user entered 3
        switch (choice) {
            case PIZZA:
                System.out.println(100);
                break;
            case BURGER:
                System.out.println(150 );
                break;
            case PASTA:
                System.out.println(200);
                break;
            case SALAD:
                System.out.println(250);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // naye me switch with enum, string bhi use kr skte hain
        // jese using string 
        String day = "MONDAY";
        switch (day) {      
            case "MONDAY":
                System.out.println("Start of the work week.");
                break;
            case "FRIDAY":
                System.out.println("End of the work week.");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek days.");
        }


        // using enum in restaurant system of above 
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }   
        Day today = Day.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek days.");
        }

        // now we can use arrow function in switch case from java 14
        // ye jyada concise and readable hota h 
        int dayOfWeek = 3; // suppose user entered 3
        switch (dayOfWeek) {    
            case 1 -> System.out.println("Start of the work week.");
            case 5 -> System.out.println("End of the work week.");
            case 6, 7 -> System.out.println("It's the weekend!");
            default -> System.out.println("Midweek days.");
        }
        // use yield to get more calculations
        int result = switch (dayOfWeek) {    
            case 1 -> {
                System.out.println("Start of the work week.");
                yield 10;
            }
            case 5 -> {
                System.out.println("End of the work week.");
                yield 20;
            }
            case 6, 7 -> {
                System.out.println("It's the weekend!");
                yield 30;
            }
            default -> {
                System.out.println("Midweek days.");
                yield 40;
            }
        };
    }
}
