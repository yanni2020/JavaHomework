package Static;
import java.util.ArrayList;
import java.util.List;

/**
 * Topic: Static
 * 2) Define a Java class “BookSeller” and then define a static inner class 
 *    “Book”, and use a static method “sellBooks” to initialize several books, 
 *    and in the main method display all the books by calling the “sellBooks” 
 *    method
 */
public class BookSeller {
    private static List<Book> list = new ArrayList<>();
    
    /**
     * define Book class
     */
    public static class Book{
        public int id;
        public String bookName;
        Book(int id, String bookName){
            this.id = id;
            this.bookName = bookName;
        }
        public void toStr(){
            System.out.println("Id: " + id + ", Book Name: " + bookName);
        }
    }

    /**
     * initial several books, then print all the book.
     */
    public static void sellBooks() {
        list.clear();
        list.add(new Book(1, "Book_1"));
        list.add(new Book(2, "Book_2"));
        list.add(new Book(3, "Book_3"));
        list.add(new Book(4, "Book_4"));
        list.add(new Book(5, "Book_5"));
        for(Book book: list){
            book.toStr();
        }
    }

    public static void main(String[] args) {
        BookSeller.sellBooks();
    }
}
