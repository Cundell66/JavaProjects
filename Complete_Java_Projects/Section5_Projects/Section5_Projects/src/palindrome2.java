import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String wordToCheck;
        StringBuilder sb = new StringBuilder();
        StringBuilder bs = new StringBuilder();
        System.out.println("Enter the word to check: ");
        wordToCheck = keyboard.nextLine();
        while (wordToCheck != ""){
            sb.append(wordToCheck);
            bs.append(wordToCheck);
            bs.reverse();
            if(sb.compareTo(bs) == 0){
                System.out.println(wordToCheck + " is a palindrome");
            }
            else {
                System.out.println(wordToCheck + " is not a palindrome");
            }
            sb.delete(0, sb.length());
            bs.delete(0, bs.length());
            System.out.println("Enter the word to check: ");
            wordToCheck = keyboard.nextLine();
        }
        keyboard.close();
    } //end main
}
