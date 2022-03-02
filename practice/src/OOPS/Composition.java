package OOPS;
import java.util.*;
public class Composition {

	public static void main(String[] args) {
		Book b1
        = new Book("EffectiveJ Java", "Joshua Bloch");
    Book b2
        = new Book("Thinking in Java", "Bruce Eckel");
    Book b3 = new Book("Java: The Complete Reference",
                       "Herbert Schildt");
    List<Book> books = new ArrayList<Book>();
    books.add(b1);
    books.add(b2);
    books.add(b3);
    Library library = new Library(books);
    List<Book> bks = library.getTotalBooksInLibrary();
    for (Book bk : bks) {
        System.out.println("Title : " + bk.title
                           + " and "
                           + " Author : " + bk.author);
    }
	}

}
class Book {
	 
    // Attributes of book
    public String title;
    public String author;
 
    // Constructor of Book class
    Book(String title, String author)
    {
 
        // This keyword refers to current instance itself
        this.title = title;
        this.author = author;
    }
}
class Library {
	 
    // Reference to refer to list of books
    private final List<Book> books;
 
    // Library class contains list of books
    Library(List<Book> books)
    {
        // Referring to same book as
        // this keyword refers to same instance itself
        this.books = books;
    }
    // Method
    // To get total number of books in library
    public List<Book> getTotalBooksInLibrary()
    {
 
        return books;
    }
}
