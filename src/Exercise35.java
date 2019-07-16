import java.util.Scanner;

public class Exercise35 {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int max = Integer.parseInt(reader.nextLine());
        int stepNumber = 0;
        int result = 0;
        while (stepNumber <= max) {
            result = result + (int)Math.pow(2,(stepNumber));
            stepNumber = stepNumber + 1;
        }
        System.out.println("Result");
        System.out.println("The result is " + result);








    }
}





