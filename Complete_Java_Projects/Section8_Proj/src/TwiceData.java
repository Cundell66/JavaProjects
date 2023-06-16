import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
    Scanner numFile;
    PrintWriter pw;
    int tempNum = 0;

    try{
        numFile = new Scanner(new File("nums.txt"));
        pw = new PrintWriter("twice_nums.txt");
        while(numFile.hasNext()){
            tempNum = numFile.nextInt();
            pw.println(tempNum*2);
        }
        numFile.close();
        pw.close();
    }   
    catch(FileNotFoundException ex){
        System.out.println(ex.getMessage());
    }      
    }
    
}
