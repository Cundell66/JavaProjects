import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        
        Random random = new Random();
        int dice;

        for (int roll = 0; roll <10; roll++ ){
            dice = random.nextInt(6) + 1;
            System.out.println("Roll " + (roll+1) + ": \t" + dice);
        }
    }
    
}
