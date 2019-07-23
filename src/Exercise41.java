import java.util.Scanner;
import java.util.Random;

    public class Exercise41 {


        public static void main(String[] args) {
            drawNumber();

        }

        //they said to have drawNumber only as the method to randomize a number but I didn't know how to transfer the randomized number in to the main method so I just did everything here.
        private static void drawNumber() {
            Random rand = new Random();
            int rand_num = rand.nextInt(100);
            Scanner reader = new Scanner(System.in);
            System.out.println("Guess a number: ");
            int num = Integer.parseInt(reader.nextLine());
            //don't know how to fix while loop so it keeps asking for the user to guess
            //keeps printing string over and over
            int guessCount = 0;
            while (num != rand_num) {
                guessCount = guessCount+1;
                if (num == rand_num) {
                    System.out.println("Congratulations, your guess is correct!");
                }
                if (num < rand_num) {
                    System.out.println("The number is greater." + "Guesses made: " + guessCount);
                }
                if (num > rand_num) {
                    System.out.println("The number is lesser." + "Guesses made: " + guessCount);
                }
            }
            System.out.println(rand_num);
            }
        }







