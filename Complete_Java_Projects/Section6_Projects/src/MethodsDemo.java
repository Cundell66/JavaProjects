public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        
        int result = giveMe10();
        System.out.println(result);
        
        result = addThese(3, 5);
        System.out.println(result);

        double sqResult = squared(5.5);
        System.out.println(sqResult);

        System.out.println(squared(7.25));

    }// end main
    
    //void parameterless
    public static void printHello() {
        System.out.println("Hello There");
    }// end print hello

    //void, parameterized
    public static void printNumber(int a){
        System.out.println("Number:" + a);
    }// end printnumber

    //value returning parameterless
    public static int giveMe10(){
        return 10;
    }// end giveme10

    //value returning parameterized
    public static int addThese(int num1, int num2 ){
        return num1 + num2;
    } //end addthese

    // square of double
    public static double squared(double a){
        return a * a;
    }// end squared

}
