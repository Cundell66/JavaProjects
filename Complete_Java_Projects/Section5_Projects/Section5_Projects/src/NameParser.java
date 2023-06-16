import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String fullName;
        String surname;
        int split;


        System.out.print("Please enter your full name: ");
        fullName = keyboard.nextLine();

        split = fullName.indexOf(" ");
        firstName = fullName.substring(0, split);
        surname = fullName.substring(split+1);
        // System.out.println("first name is " + firstName);
        // System.out.println("surname is " + surname);
        String upper = firstName.toUpperCase();
        String lower = surname.toLowerCase();

        System.out.println("first name in upper case is " + upper);
        System.out.println("surname in lower case is " + lower);
        keyboard.close();
        
    } // end main
    
}
