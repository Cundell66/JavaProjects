public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        } // end for


        for(int n : myArray){
            System.out.println(n);
        }//end for

    } //end main
    
}
