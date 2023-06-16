import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        char gender;
        int age;


        System.out.println("Please enter your gender and age: ");
        gender = keyboard.next().charAt(0);
        age = keyboard.nextInt();
        keyboard.nextLine();

        if (age >= 19){
            switch (gender){
                case 'M':
                case 'm':
                    System.out.println("Awesome, you can join a fraternity.");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Sorry, have you considered a sorority?");
                    break;
                    default:
                    System.out.println("Ooops, that's not a valid gender");
            } // end switch
        } // end if        
        else {
            System.out.println("Come back when you are old enough");
            } //end else

        } // end main
    }
    

