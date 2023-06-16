import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(22);

        for(int i = 0; i < myAL.size(); i++){
            System.out.println(myAL.get(i));
        }//end for

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String piValue = "3.14159";
        double doubleValue = Double.parseDouble(piValue);
        //doubleValue *= 10;

        System.out.println(doubleValue);
    }//end main
    
}
