import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John Smith");
        names.add("David Jones");
        names.add("Peter Tork");
        names.add("Mike Nesmith");
        names.add("Micky Dolenz");

        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for (String name:names){
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to file!");
        }
    }// end main
    
}
