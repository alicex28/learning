import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int number;
        int sum = 0;
        int count = 0;
        int oddNumber = 0;
        int evenNumber = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            // right here, there is a fork in the road

            // if user entered -1, this is where we stop.
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }

            // if user did not enter -1, this is where we continue.
            sum = sum+number;
            count = count+1;

            if (number % 2 == 0) {
                evenNumber = evenNumber+1;
            }

            if (number % 2 != 0) {
                oddNumber = oddNumber+1;

            }

        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        double average = (double)sum/count;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumber);
        System.out.println("Odd numbers: " + oddNumber);








    }
}





