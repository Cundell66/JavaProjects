import java.util.Scanner;;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double number;

        System.out.println("What Is Your Name? ");
        name = keyboard.nextLine();

        System.out.println("What Is Your Age? ");
        age = keyboard.nextInt();
        keyboard.nextLine(); //consume the new line

        System.out.println("Enter a number: ");
        number = keyboard.nextDouble();
        keyboard.nextLine(); //consume the new line
        number *= 2;
        System.out.println("number x 2 = " + number);
        
        System.out.println("What city do you live in? ");
        city = keyboard.nextLine();


        System.out.println("Hello " + name);
        System.out.println("age is " + age);
        System.out.println("City is " + city);
    } // end main
    
}
