package Composition2;

public class Book1 {
    private  String title, author , isbn;
    

    public Book1(String title, String author, String isbn ){
            this.title=title;
            this.author=author;
            this.isbn=isbn;
    }

    void display(){
        System.out.println("title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: "+ isbn);
    }
}
