import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(55);
        al.add(121);

        System.out.println("sum is:" + sumElements(al));
    }
    

    public static int sumElements(ArrayList<Integer> toSum){
        int total = 0;
 //       for(int i = 0; i < toSum.size(); i++){
 //           total += toSum.get(i);
 //       }

        for (int num : toSum){
            total += num;
        }
        return total;
    }
}
