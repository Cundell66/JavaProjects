public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "Fantasy", 864);
        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
        Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);
        
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();

    }// end main
    

    // public static void printBookDetails(Book books){
    //     System.out.println("Author:" + books.getAuthor() + "\nTitle:" +
    //                     books.getTitle() + "\nGenre:" + books.getGenre() +
    //                     "\nPages:" + books.getNumPages());
    //     System.out.println();    
    //     }
        
}// end class
