package library;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private String publicationYear;
    private boolean isBorrowed;

    public Book(String bookID,String title,String author,String genre, String publicationYear){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.publicationYear=publicationYear;
        this.isBorrowed=false;
    }

    public String getBookID(){
        return this.bookID;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public String getPublicationYear(){
        return publicationYear;
    }


   


}
