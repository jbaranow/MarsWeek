import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public  static void main(String[] args) {
        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name) ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {
            int guess = input.nextInt();

            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, please try again!");
            } else if (guess > number) {
                System.out.println("Your guess is too high, please try again!");
            }
        }

        //Scanner
    }
}
