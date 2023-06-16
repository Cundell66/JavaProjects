import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        System.out.println("Enter 5 names and their ages");

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a name:\t");
            name.add(keyboard.nextLine());
            System.out.print("Enter their age:\t");
            age.add(keyboard.nextInt());
            keyboard.nextLine();
        }

        for(int i = 0; i < age.size(); i++){
            System.out.println(name.get(i) + " is " + age.get(i) + " years old");
        }

    }
    
}
