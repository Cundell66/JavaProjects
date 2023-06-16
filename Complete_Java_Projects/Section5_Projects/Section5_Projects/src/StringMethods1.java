public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String name4 = "Paul Cundell";

        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i) + " ");

        }// end for
        System.out.println();

        if (name.equals(name2)){
            System.out.println("Names are equal.");
        }
        else {
            System.out.println("Names are not equal.");
        }

        if(name.compareTo(name3) > 0){
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        }

        if(name.compareTo(name4) > 0){
            System.out.println("name > name4");
        }
        else {
            System.out.println("name <= name4");
        }
    }//end main
    
}
