import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("First number:");
        int min = Integer.parseInt(reader.nextLine());
        System.out.println("Last number:");
        int max = Integer.parseInt(reader.nextLine());
        int stepNumber;
        stepNumber = min;
        int sum = 0;
        while ((stepNumber <= max) && (stepNumber >= min)) {
            sum = stepNumber + sum;
            System.out.println(stepNumber);
            stepNumber = stepNumber + 1;
        }
        System.out.println("Sum");
        System.out.println(sum);




    }
}





