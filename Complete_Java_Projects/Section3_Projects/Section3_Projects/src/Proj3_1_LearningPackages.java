import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int learningPackage;
        int courses = 0;
        int cost = 0;

        System.out.println("Welcome To Learning Stars");
        System.out.println("Which learning package are you on? ");
        System.out.print("(1, 2 or 3)\t");
        learningPackage = keyboard.nextInt();
        
        keyboard.nextLine();
        
        System.out.println("OK, and how many courses have you enrolled in?");
        courses = keyboard.nextInt();

        switch(learningPackage){
            case 1:
                if (courses > 2){
                    cost = 10 + ((courses - 2) * 6);
                    break;
                }
                else{
                    cost = 10;
                    break;
                }
            case 2:
                if (courses > 4){
                    cost = 12 + ((courses - 4) * 4);
                    break;
                }
                else{
                    cost = 12;
                    break;
                }
            case 3:
                if (courses > 6){
                    cost = 15 + ((courses - 6) * 3);
                    break;
                }
                else{
                    cost = 15;
                    break;
                }
            default:
                System.out.println("Invalid Learning Package");
            }
                if(courses > 0){
            System.out.println("You are on Learning Package " + learningPackage);
            System.out.println("you have enrolled on " + courses + " courses");
            System.out.println("The total cost for the month is $" + cost);
        }
        
    }
    
}
