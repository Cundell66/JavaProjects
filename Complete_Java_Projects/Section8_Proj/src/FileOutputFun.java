import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class FileOutputFun {
    public static void main(String[] args) {
        
        try {
            PrintWriter pw= new PrintWriter("output.txt");

            pw.println("Hello there");
            pw.println("My Name Is Paul");
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to file");
        }// end try-catch

    }// end main
    
}
