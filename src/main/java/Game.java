import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int userNumber;
        int randomNumber = rnd.nextInt(105) + 1;
        System.out.println("Guess the number between 1 - 10");
        while (true) {
            while (!scan.hasNextInt()) {
                System.out.println("Put correct value between 1 - 10");
                scan.next();
            }
            userNumber = scan.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Your number is too high. Please choose a number");
            } else if (userNumber < randomNumber) {
                System.out.println("Your number is to low. Please choose number");
            } else {
                break;
            }
            count++;
        }
        System.out.println("Yes it's correct number. You guessed it in " + count + " times");
    }
}