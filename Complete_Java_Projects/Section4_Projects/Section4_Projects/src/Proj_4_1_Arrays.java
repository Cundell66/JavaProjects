import java.util.Scanner;

public class Proj_4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] userInput;
        userInput = new int[5];

        System.out.println("Please enter 5 integers: ");

        for(int i = 0; i < userInput.length; i++){
            userInput[i] = keyboard.nextInt();
            
        }// end for
        
        for(int i = 0; i < userInput.length; i++){
            System.out.println("Your Number " + (userInput[i]) + " times 2 is " + (userInput[i] * 2));

        }

    } // end main
    
}
