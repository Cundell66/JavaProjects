import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int split;
        String name;
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        System.out.println("Please enter five full names: ");
        for(int i = 0; i < 5; i++){
            System.out.print("Name " + (i + 1) + "\t");
            name = keyboard.nextLine();
            split = name.indexOf(" ");
            first.add(name.substring(0, split));
            last.add(name.substring(split + 1));

        }
        for (int f = 0; f < 5; f++){
            for (int l = 0; l < 5; l++){
                System.out.println(first.get(f) + " " + last.get(l));
            }
        }
        keyboard.close();
    } // end main
    
}
