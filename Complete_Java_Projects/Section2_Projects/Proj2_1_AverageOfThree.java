import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double first;
        double second;
        double third;

        /* System.out.println("Enter your first number: ");
        first = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Enter your second number: ");
        second = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Enter your third number: ");
        third = keyboard.nextDouble();
        keyboard.nextLine();
        */
        System.out.println("Enter 3 numbers: ");
        first = keyboard.nextDouble();
        second = keyboard.nextDouble();
        third = keyboard.nextDouble();
        keyboard.nextLine();
        
        double average = (first + second + third)/3;
        System.out.println("The average is: " + average);
        
    }
    
}
