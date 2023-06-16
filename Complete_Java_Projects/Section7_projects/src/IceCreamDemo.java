public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ninetynine = new IceCream("99", 3 , 1);
        IceCream chocolate = new IceCream("chocolate", 3, 3);
        IceCream strawberry = new IceCream("Strawberry", 2, 2);


        ninetynine.addTopping("flake");
        ninetynine.addTopping("syrup");
        chocolate.addTopping("nuts");
        chocolate.addTopping("cherries");
        strawberry.addTopping("sprinkles");

        ninetynine.printToppings();
        chocolate.printToppings();
        strawberry.printToppings();

    }// end main
    
}// end class
