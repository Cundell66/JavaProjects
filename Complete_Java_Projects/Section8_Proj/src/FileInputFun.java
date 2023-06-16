import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;

        try{
            infile =new Scanner(new File("input.txt"));
            int input;
            int total = 0;

            while(infile.hasNext()){
                input = infile.nextInt();
                total += input;
            }//end while
            System.out.println("Total is: " + total);
            infile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Can't find file");
            System.out.println(ex.getMessage());
        }// end try-catch
        catch(InputMismatchException ex){
            System.out.println("Error Reading Input!");
        }
    }// end main
    
}
