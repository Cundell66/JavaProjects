import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String wordToCheck;
        boolean check = true;
        System.out.println("Enter the word to check: ");
        wordToCheck = keyboard.nextLine();
        int length = wordToCheck.length();
        int limit = length/2;
        while (wordToCheck.length() > 0){
            for (int i = 0; i < limit; i++){
                if(wordToCheck.charAt(i)!=wordToCheck.charAt(length - (i + 1))){
                    System.out.println(wordToCheck + " is not a palindrome");
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(wordToCheck + " is a palindrome");
            }
            System.out.println("Enter the word to check: ");
            wordToCheck = keyboard.nextLine();
            length = wordToCheck.length();
            limit = length/2;
            check = true;
            
        }  
        keyboard.close();  
    }
}
