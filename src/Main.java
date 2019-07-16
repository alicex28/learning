import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /*
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Pick a number [0-1000]: ");
            int number = Integer.parseInt(reader.nextLine());

            if ((number % 10 == 0) && (number % 15 == 0)) {
                System.out.println("nice, great!");
            }
            else if (number % 15 == 0) {
                System.out.println("great!");
            }
            else if (number % 10 == 0) {
                System.out.println("nice!");
            }
            else if (number == 52) {
                break;
            }
        }
        */
        /*
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println("Sum: " + sum);
        */
        /*
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Type a number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            else {
                sum = sum + read;
            }



            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
        */

        int number = 100;
        while (number >= 0) {
            System.out.println(number);
            number = number-1;
        }






    }
}





