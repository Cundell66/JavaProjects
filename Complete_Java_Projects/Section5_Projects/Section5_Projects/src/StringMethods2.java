public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "John Baugh";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();
        
        int whereIsB = myName.indexOf("B");

        String lastName = myName.substring(5);

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(whereIsB);
        System.out.println(lastName);


    }//end main
    
}
