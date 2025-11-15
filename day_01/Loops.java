    package day_01;

    public class Loops {
        public static void main(String[] args) {
            // for loop
            System.out.println("For Loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteration: " + i);
            }

            // while loop
            System.out.println("\nWhile Loop:");
            int j = 1;
            while (j <= 5) {
                System.out.println("Iteration: " + j);
                j++;
            }

            // do-while loop
            System.out.println("\nDo-While Loop:");
            int k = 1;
            do {
                System.out.println("Iteration: " + k);
                k++;
            } while (k <= 5);
        }
    }
