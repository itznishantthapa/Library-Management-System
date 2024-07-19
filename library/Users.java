package library;

abstract class Users {
    protected String userID;
     protected String name;
     protected int age;
     protected String phoneNumber;
     protected String email;
}

class Admin extends Users{

    //Constructor
    Admin(String userID,String name, int age, String phoneNumber, String email) {
        this.userID=userID;
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public void addBook(){
        System.out.println("Book added successfully");
    }
    public void updateBook(){
        System.out.println("Book updated successfully");
    }
    public void deleteBook(){
        System.out.println("Book deleted successfully");
    }


 
    public void addMember(){

    }
    public void removeMember(){

    }


}




class Member extends Users{

    //Constructor
    Member(String name, int age, String phoneNumber, String email) {
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
 
    public void viewBook(){

    }
    public void borrowBook(){

    }
    public void returnBook(){

    }


}
