import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int max = Integer.parseInt(reader.nextLine());
        //System.out.println(number);
        int stepNumber = 1;
        int sum = 0;
        while (stepNumber <= max) {
            if (stepNumber % 2 == 0) {
            sum = stepNumber + sum;
            }
            System.out.println(stepNumber);
            stepNumber = stepNumber + 1;
        }
        System.out.println("Sum");
        System.out.println(sum);








    }
}





