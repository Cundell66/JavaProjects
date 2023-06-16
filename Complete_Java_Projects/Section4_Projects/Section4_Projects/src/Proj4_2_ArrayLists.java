import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean carryOn = true;
        double userInput = 0;

        System.out.println("Please enter your real numbers:");
        System.out.println("or a negative to quit");

        while (carryOn){
            userInput = keyboard.nextDouble();
            if (userInput < 0){
                break;
            }
            else {
            numbers.add(userInput);
            }
            
        }// end while

        for (int i = numbers.size() - 1; i >= 0; i--){
            System.out.println(numbers.get(i));

        }// end for

    }// end main
}
