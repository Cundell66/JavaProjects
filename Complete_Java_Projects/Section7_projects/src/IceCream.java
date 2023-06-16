import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    
    public IceCream(){
        name = "cone";
        cost = 1;  
        numScoops = 1;
        toppings = new ArrayList<>();  
    }

    public IceCream(String name, int cost, int numScoops){
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getNumScoops(){
        return numScoops;
    }

    public void printToppings(){
        System.out.println(name + " has " + numScoops + " scoops");
        System.out.println("Topped with:");
        for (String topping : toppings){
            System.out.println("\t" + topping);
        }
        System.out.println("and the cost is $" + cost);
        System.out.println();
    }



    
}// end class