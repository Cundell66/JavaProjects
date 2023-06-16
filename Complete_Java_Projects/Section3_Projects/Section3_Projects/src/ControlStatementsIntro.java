public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 16;

        if(age >= 16) {
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You can't drive yet!");
        }

        System.out.println();

        for (int i = 1; i <= age; i++){
                System.out.println("Happy Birthday " + i);
        } // end for
    }// end main
    
}
