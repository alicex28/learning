import java.util.Scanner;
import java.util.Random;

public class Exercise41 {


    public static void main(String[] args) {
        int rand_num = drawNumber();
        Scanner reader = new Scanner(System.in);

        System.out.println("Guess a number: ");
        int num = Integer.parseInt(reader.nextLine());

        //don't know how to fix while loop so it keeps asking for the user to guess
        //keeps printing string over and over
        int guessCount = 0;

        while (num != rand_num) {
            guessCount = guessCount + 1;

            if (num < rand_num) {
                System.out.println("The number is greater. Guesses made: " + guessCount);
            }
            if (num > rand_num) {
                System.out.println("The number is lesser. Guesses made: " + guessCount);
            }

            System.out.println("Guess a number: ");
            num = Integer.parseInt(reader.nextLine());
        }

        // if we get out of this while loop, that means user must have guessed correctly.
        System.out.println("Congratulations, your guess is correct!");
        System.out.println(rand_num);

    }

    //they said to have drawNumber only as the method to randomize a number but I didn't know how to transfer the randomized number in to the main method so I just did everything here.
    private static int drawNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}







