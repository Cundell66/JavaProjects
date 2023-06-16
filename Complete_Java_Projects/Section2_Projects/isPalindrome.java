import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args){
    String wordToCheck;

    Scanner keyboard = new Scanner(System.in);

    
    System.out.print("Enter the word to check: ");
    wordToCheck = keyboard.nextLine();
    System.out.println();
    
    if (palindrome(wordToCheck)) {
        System.out.println(wordToCheck + " is a palindrome");
    } else {
        System.out.println(wordToCheck + " is not a palindrome");
        }
    }
    public static boolean palindrome(String word){
        // convert to lowercase
        word = word.toLowerCase();
        // reverse the word
        String reversedWord = new StringBuilder(word).reverse().toString();
        //compare words
        return word.equals(reversedWord);
    
    }
}


