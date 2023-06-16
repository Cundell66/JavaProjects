public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        // relational operations
        boolean agecomparison = myAge > yourAge;
        
        System.out.println("my age > your age? " + agecomparison);

        agecomparison = yourAge > bobsAge;
        System.out.println("your age > bobs age? " + agecomparison);

        agecomparison = yourAge == bobsAge;
        System.out.println("your age = bobs age? " + agecomparison);

        String myName = "John";
        String yourName = "John";
        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do the names match? " + nameComparison);

        int currentAge = 56;
        agecomparison = currentAge >= 21;
        System.out.println("Is age >= 21? " + agecomparison);


    } // end main
    
}
