import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int number;
        int sum = 1;
        int count = -1;
        int oddNumber = -1;
        int evenNumber = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            sum = sum+number;
            count = count+1;

            if (number % 2 == 0) {
                evenNumber = evenNumber+1;
            }

            if (number % 2 != 0) {
                oddNumber = oddNumber+1;

            }

            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
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





