package Static;
/**
 * Topic: Static
 * 1) Given a database table “Book” with columns (id, isbn, name, author, 
 *    publish date), define a java class that matches this table and then use a 
 *    static block to initialize this table with some records
 */
public class Book {
    private static int id;
    private static String isbn, author, publishDate;
    private String name;

    public static void init(int id, String isbn, String author, String publishDate){
        Book.id = id;
        Book.isbn = isbn;
        Book.author = author;
        Book.publishDate = publishDate;
    }

    Book(String name){
        this.name = name;
    }

    public String toString(){
        return "Id:" + id + ", Isbn: " + isbn + ", Name: " + name + ", Author: "
        + author + ", Public Date: " + publishDate;
    }

    public static void main(String[] args) {
        Book.init(101, "isbn999", "Doge", "Aug,1,2022");
        Book myBook = new Book("me");
        Book sekiro = new Book("sekiro");
        System.out.println(myBook.toString());
        System.out.println(sekiro.toString());
    }
}
