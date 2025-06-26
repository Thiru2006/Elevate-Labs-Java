import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class Book{
    ArrayList<String> Books;
    ArrayList<Integer> Quantity;
    ArrayList<String> Author;

    Book(){
        this.Books = new ArrayList<String>(Arrays.asList("Clean Code","Think Like a Programmer","The Clean Coder","The Pragmatic Programmer","Code Complete"));
        this.Author = new ArrayList<String>(Arrays.asList("Robert C. Martin","V. Anton Spraul","Robert C. Martin","Andrew Hunt and David Thomas","Steve McConnell"));
        this.Quantity = new ArrayList<Integer>(Arrays.asList(10,2,51,12,1));
    }
    public void AllBooks(){
        for(int i=0;i<Books.size();i++){
            System.out.println("Book Name: "+Books.get(i)+" --- Author Name: "+Author.get(i)+" --- Available Quantity: "+Quantity.get(i));
        }
    }
    public void IssueBook(Scanner ss){
        System.out.println("\nAvailable Books: ");
        for(int i=0;i<Books.size();i++){
            System.out.println((i+1)+". Book Name: "+Books.get(i));
        }
        System.out.print("Enter your choice from the available books: ");
        int choice = ss.nextInt();
        choice--;
        if (Quantity.get(choice) <= 0) {
            System.out.println("Sorry! Book is out of stock.");
            return;
        }
        else{
            int cvalue = Quantity.get(choice);
            cvalue--;
            this.Quantity.set((choice),(cvalue));
            System.out.println("Thanks for using the Book!");
        }
        
    }
    public void ReturnBook(Scanner ss){
        System.out.println("\nAvailable Books: ");
        for(int i=0;i<Books.size();i++){
            System.out.println((i+1)+". Book Name: "+Books.get(i));
        }
        System.out.print("Enter your choice from the available books: ");
        int choice = ss.nextInt();
        choice--;
        int cvalue = Quantity.get((choice));
        cvalue++;
        this.Quantity.set((choice),(cvalue));
        System.out.println("Thanks for returning the Book!");
    }
}
class User {
    User(Scanner ss, Book book) { 
        String a = "y";
        System.out.print("Enter your UserName: ");
        String username = ss.nextLine();  

        while (a.equalsIgnoreCase("Y")) {
            System.out.println("Welcome " + username + ", Choose an option which need to be done: ");
            System.out.println("1. Available Books");
            System.out.println("2. Book Issue");
            System.out.println("3. Book Return");
            System.out.print("Enter your choice: ");
            int choice = ss.nextInt();
            ss.nextLine();

            if (choice > 0 && choice <= 3) {
                if (choice == 1) {
                    book.AllBooks();
                } else if (choice == 2) {
                    book.IssueBook(ss);
                } else {
                    book.ReturnBook(ss);
                }
                System.out.print("Do you want to continue(y/n)?: ");
                a = ss.next();
                System.out.println();
            } else {
                System.out.println("Invalid Choice! Try Again");
            }
        }
    }
}


class Library {
    Library(Scanner ss){
        Book book = new Book();  
        User user = new User(ss, book); 
    }
}


public class Main{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        Library lib = new Library(ss);
    }
}