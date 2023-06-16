import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int input;
        int sum = 0;

        //priming read
        System.out.println("Enter a non-negative integer ");
        System.out.println("or negative to exit:");
        input = keyboard.nextInt();

        while (input >= 0){
            sum += input;
            System.out.println("Enter a non-negative integer ");
            System.out.println("or negative to exit:");
            input = keyboard.nextInt();
        }// end while
        
        System.out.println("Total is: " + sum);
    }// end main
    
}
