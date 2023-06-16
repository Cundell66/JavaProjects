public class countdown {
    public static void main(String[] args) {
 //       countDownFrom(10);
        countUpTo(1, 10);
    }// end main
    
    public static void countDownFrom(int num){
        if (num >= 0){
            System.out.println(num);
            countDownFrom(num - 1);
        }

    }

    public static void countUpTo(int start, int end){
        if (start <= end){
            System.out.println(start);
            countUpTo(start + 1, end);
        }
    }
}
