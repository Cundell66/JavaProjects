import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        Scanner inFile;
        Rectangle rectangle;
        double length;
        double width;
        ArrayList<Rectangle> rectangles;
        try{
            inFile = new Scanner(new File("rectangle_data.txt"));
            rectangles = new ArrayList<>();
            
            while(inFile.hasNext()){
                length = inFile.nextDouble();
                width = inFile.nextDouble();
                rectangle = new Rectangle(length, width);
                rectangles.add(rectangle);
            }
            inFile.close();
            
            for(Rectangle rect:rectangles){
                System.out.println("Length: " + rect.getLength() + "\nWidth: " + rect.getWidth() +
                                    "\nArea: " + rect.area() + "\nPerimeter: " + rect.perimeter());
                System.out.println();   
            }
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
