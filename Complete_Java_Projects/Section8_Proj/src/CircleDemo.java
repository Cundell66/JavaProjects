public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        Circle yourCircle = new Circle();

        printCircle(yourCircle);
        printCircle(myCircle);

        yourCircle.setRadius(12.75);
        printCircle(yourCircle);
    
    }
    
    public static void printCircle(Circle circle){
        System.out.println("Circle with radius:" + circle.getRadius());
        System.out.println(" has area: " + 
            String.format("%.2f",circle.area()));
        System.out.println(" and circumference: " + 
            String.format("%.2f",circle.circumference()));
        System.out.println();

    }
}
