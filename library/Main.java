package library;
import java.util.*;

public class Main {
  ArrayList<Book> bookList= new ArrayList<>();

 
  public static void main(String[] args) {
   
    while (true) {
      
    
    Main mn= new Main();
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Login Admin \n2.Login Member");
    int choice =sc.nextInt();


    if(choice==1){
       System.out.println("Please enter your ID");
       System.out.println("1.Manage Books \n2.Manage Members");
       int adminChoice = sc.nextInt();
       mn.manageBooksMember(adminChoice, sc);

    }
    else if(choice==2){
      System.out.println("Please enter your ID");
    }
    else{
        System.out.println("Invalid Choice");
    }
  }
}

  void manageBooksMember(int adminChoice, Scanner sc){
       if(adminChoice==1){
        System.out.println("1.Add books \n2.Remove books \n3.Update");
        int bookChoice = sc.nextInt();
        bookManager(bookChoice, sc);
        }
          else if(adminChoice==2){
          System.out.println("1.Add member \n2.Remove member");
        }

  }

    void bookManager(int bookChoice,Scanner sc){
      
          switch (bookChoice) {
            case 1:
              addBook(sc);
              break;
            case 2:
              removeBook(sc);
              break;
          
            default:
             System.out.println("Invalid Choice");
              break;
          }
        
    }

    void addBook(Scanner sc){

      System.out.println("Give a id to the book");
      String bookID=sc.next();
      System.out.println("Enter the book title");
      String title = sc.next();
      System.out.println("Enter the book author");
      String author=sc.next();
      System.out.println("Enter the book genre");
      String genre=sc.next();
      System.out.println("Enter the book publiction year");
      String publicationYear=sc.next();

      Book bk = new Book(bookID, title, author, genre, publicationYear);
      bookList.add(bk);
      System.out.println("Added book successfully");

      for(Book bk1: bookList){
        System.out.println("--------------These are book objts------------------------");
        System.out.println(bk1);
        if(bk1 instanceof Book){
          System.out.println("Book title is "+ bk1.getTitle());
          System.out.println( "Book author is "+ bk1.getAuthor());
          System.out.println("Book genre is "+ bk1.getGenre());
          System.out.println( "Book publication year is "+ bk1.getPublicationYear());
        }
      }
    }



     void removeBook(Scanner sc) {
      System.out.println("Enter the book ID you want to remove:");
      String bookID = sc.next();
      bookList.removeIf(book -> book.getBookID().equals(bookID));
      System.out.println("Removed book successfully");
      System.out.println(bookList);
  }

}





