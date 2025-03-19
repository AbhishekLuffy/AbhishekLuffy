package Composition2;
import java.util.ArrayList;
import java.util.Scanner;;

public class Library {
    private ArrayList<Book1>books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addbook(Book1 book){
        books.add(book);
    }

    public void display(){
        for(Book1 book : books){
            book.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the No of books:");
        int n = sc.nextInt();
        for(int i=0 ; i < n ; i++){
            System.out.println("Enter the title of book");
            String title = sc.nextLine();
            System.out.println("Enter the Author name:");
            String author = sc.nextLine();
            System.out.println("Enter the ISBN no:");
            String isbn = sc.nextLine();
            Book1 Book =  new Book1(title , author , isbn);
            lib.addbook(Book);

        }
        lib.display();

    }
    
}
