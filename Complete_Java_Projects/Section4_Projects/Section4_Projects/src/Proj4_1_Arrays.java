import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();

        System.out.println("Please enter 5 integers: ");
        for (int i = 0; i < 5; i++ ){

            userInput.add(keyboard.nextInt());

        }
        for (int i = 0; i < 5; i++){

            System.out.println("number " + (i + 1) + " is " + userInput.get(i));

        }


    }
    
}
