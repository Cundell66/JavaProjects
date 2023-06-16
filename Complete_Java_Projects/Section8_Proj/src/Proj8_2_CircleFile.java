import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList;
        circleList = new ArrayList<>();
            
        fillArrayList(circleList);
        printCircles(circleList);
    }

    public static String circleData(Circle c){
        return "radius: " + String.format("%.2f", c.getRadius()) + "\narea: " + String.format("%.2f",c.area()) + "\ncircumference: " + String.format("%.2f",c.circumference()) + "\n\n";
    }

    public static void fillArrayList(ArrayList<Circle> cList){
        Scanner inFile;
        
        try{
            inFile = new Scanner(new File("circle_data.txt"));
            Circle circle;
            double radius;
        
            while (inFile.hasNext()) {
                radius = inFile.nextDouble();
                circle = new Circle(radius);
                cList.add(circle);
            } 
            inFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void printCircles(ArrayList<Circle> circleList){
        PrintWriter pw;
        try{
            pw = new PrintWriter("circles_output.txt");
            for (Circle c:circleList){
                System.out.println(circleData(c));
                pw.println(circleData(c));
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }    
}
