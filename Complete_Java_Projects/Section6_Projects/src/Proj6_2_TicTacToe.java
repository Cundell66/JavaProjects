import java.util.Scanner;

public class Proj6_2_TicTacToe {

    public static void main(String[] args) {
        runGame();
        
    }//end main
    
    public static void runGame() {
        String[][] gameBoard = new String[3][3];
        boolean xTurn = false;
        initializeGameBoard(gameBoard);
        String winner = getWinner(gameBoard); 
        
        while(!isBoardFull(gameBoard) && getWinner(gameBoard) == ""){
            printCurrentBoard(gameBoard);
            if(xTurn){
                System.out.println("It is X's turn");
            } else { 
                System.out.println("It is O's turn");
            }
            getUserInput(xTurn, gameBoard);
            xTurn = !xTurn;
            
        } // end while
        printCurrentBoard(gameBoard);
        winner = getWinner(gameBoard);
        if(isBoardFull(gameBoard)){
            System.out.println("It was the Cat's Game! No Winner");
        } else {
            System.out.println("The winner is " + winner);
        } 
        
    }//end runGame
    
    public static void initializeGameBoard(
    String[][] gameBoard) {
    for (int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            gameBoard[i][j] = " ";
        }
    }
    }//end initializeGameBoard
    
    public static void printCurrentBoard(
    String[][] gameBoard) {
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(gameBoard[i][j]);
                if(j < 2){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i < 2){
                System.out.println("-----");
            }
            
        }
    }//end printCurrentBoard
    
    public static void getUserInput(boolean xTurn,
    String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);
        int r;
        int c;
        
        System.out.println("Please enter the row THEN the column, each from 0, 1, or 2, seperated by a space");
        r = keyboard.nextInt();
        c = keyboard.nextInt();
        keyboard.nextLine();
        if(r < 0 || c < 0 || r > 2 || c > 2){
            System.out.println("Invalid input");
            getUserInput(xTurn, gameBoard);
        } else {
            if(cellAlreadyOccupied(r, c, gameBoard)){
                System.out.println("That Cell Is Already Occupied");
                getUserInput(xTurn, gameBoard);
            } else {
                if(xTurn){
                   gameBoard[r][c] = "X";
                } else {
                   gameBoard[r][c] = "O";
                }
            }
        }
       
    
    }//end getUserInput
    
    public static boolean cellAlreadyOccupied(int row,
    int col, String[][] gameBoard) {
        if(gameBoard[row][col] != " "){
            return true;
        }    
        return false;
    }//end cellAlreadyOccupied
    
    public static String getWinner(
    String[][] gameBoard) {
        for(int i = 0; i < 2; i++){
            if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][0] != " "){
                return gameBoard[i][0];
            } // rows
            else if (gameBoard[0][i] == gameBoard[1][i] && gameBoard[0][i] == gameBoard[2][i] && gameBoard[0][i] != " "){
                
                return gameBoard[0][i];
            } // columns
            else if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] && gameBoard[0][0] != " "){
                
                return gameBoard[0][0];
            } // Left Diag
            else if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[0][2] && gameBoard[2][0] != " "){
                
                return gameBoard[1][1];
            } // Right Diag
        } // end for

        return "";
    }//end getWinner
    
    public static boolean isBoardFull(
    String[][] gameBoard) {
        boolean full = true;        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == " "){
                    full = false; 
                } // end if
            } // end j for
        } // end i for
        return full;
    }//end isBoardFull

}//end class
   