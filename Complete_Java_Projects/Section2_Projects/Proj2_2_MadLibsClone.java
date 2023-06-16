import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        String adj1;
        String girl;
        String adj2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adj3;
        String occupation2;
        String boy;
        String man;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" Hi, Please enter the following:");
        System.out.print("an adjective: ");
        adj1 = keyboard.nextLine();
        System.out.print("a girls name: ");
        girl = keyboard.nextLine();
        System.out.print("another adjective: ");
        adj2 = keyboard.nextLine();
        System.out.print("an occupation: ");
        occupation1 = keyboard.nextLine();
        System.out.print("the name of a place: ");
        place  = keyboard.nextLine();
        System.out.print("an item of clothing: ");
        clothing = keyboard.nextLine();
        System.out.print("a hobby: ");
        hobby = keyboard.nextLine();
        System.out.print("another adjective: ");
        adj3 = keyboard.nextLine();
        System.out.print("another occupation: ");
        occupation2 = keyboard.nextLine();
        System.out.print("a boys name: ");
        boy = keyboard.nextLine();
        System.out.print("and finally a mans name: ");
        man = keyboard.nextLine();
        System.out.println();
        System.out.println("There once was a " + adj1 + " girl named " + girl + ", who was a " + adj2 + " " + occupation1 + " in the kingdom of " + place + ". \nShe loved to wear " + clothing + " and to " + hobby + ". \nShe wanted to marry the " + adj3 + " " + occupation2 + " named " + boy + " but her father, King " + man + " forbid her from seeing him.") ;

    }
    
}
