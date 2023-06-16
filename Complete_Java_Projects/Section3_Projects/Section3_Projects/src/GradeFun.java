import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade ");
        grade = keyboard.next().charAt(0);

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("Doing great!");
                break;
            case 'B':
            case 'b':
                System.out.println("Very good");
                break;
            case 'C':
            case 'c':
                System.out.println("Could do better ");
                break;
            case 'D':
            case 'd':
                System.out.println("Oh dear, you need to work harder");
                break;
            case 'F':
            case 'f':
                System.out.println("See me after class");
                break;
            default:
                System.out.println("Sorry, that's an invalid grade");
        } //end switch

    }// end main
    
}
