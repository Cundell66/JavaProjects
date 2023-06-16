import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int guess = 0;
        int target = random.nextInt(100) + 1;
        int count = 0;
        System.out.println("Try to guess the mystery number between 1 and 100 inclusive in less than 10 guesses:");
        while (guess >= 0 && count < 10){
            count++;
            System.out.println("Enter guess " + count + ": ");
            System.out.println("or a negative number to quit");
            guess = keyboard.nextInt();
            if(guess>0){
                if (guess > 100){
                    System.out.println("That was a wasted guess! Pick a number between 1 and 100 inclusive!");
                    continue;
                }
                else if (guess == target){
                    System.out.println("Congratulations! You guessed the number in " + count +" guesses!");
                    break;
                    } 
                else if (guess < target){
                    System.out.println("Sorry, Your guess was too low");
                    continue;
                    }
                else {
                System.out.println("Sorry, your guess was too high");
                continue;
                }
            }
        }
        System.out.println("Thanks for playing");
    }
}
    

