public class Book {

    private String author;
    private String title;
    private String genre;
    private int numPages;
    

    public Book(String author, String title, String genre, int numPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages =numPages;

    }// end ctor

    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    public String getGenre() {
        return genre;
    }

    public int getNumPages(){
        return numPages;
    }

    public void printBookDetails(){
        System.out.println("Author:" + getAuthor() + "\nTitle:" +
        getTitle() + "\nGenre:" + getGenre() +
        "\nPages:" + getNumPages());
        System.out.println();    

    }

}// end Book Class
