public class MethodCalls {
    public static void main(String[] args){
        doSomething();
    }// end main

    public static void doSomething(){
        
        int result = getSomeValue();

        System.out.println("result = " + result);
    }

    public static int getSomeValue(){
        return 150;
    }
}