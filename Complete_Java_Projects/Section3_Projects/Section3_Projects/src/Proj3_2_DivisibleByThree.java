import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int input;
        int divisible;

        System.out.print("Enter an integer to check: \t");
        input = keyboard.nextInt();
        divisible = input % 3;

        if (divisible == 0){
            System.out.println(input + " is divisible by 3");
        }
        else{
            System.out.println(input + " is NOT divisible by 3");
        }

    } // end main
    
}
