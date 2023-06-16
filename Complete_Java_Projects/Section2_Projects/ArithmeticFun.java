public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int result = a + b;
        int difference = b - a;
        int product = b * a;
        int quotient = b / a;
        int remainder = b % a;


        System.out.println("sum is " + result);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        result += c;
        difference -= c;
        product *= c;
        quotient /= c;
        remainder %= c;

        System.out.println("result is now " + result);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        result ++;
        System.out.println("result is now " + result);
        result --;
        System.out.println("result is now " + result);
        
        product *= 2;
        System.out.println("product x 2 is " + product);

    }
    
}
