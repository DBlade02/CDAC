import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Books Available:");
        for (Book book : books) {
            System.out.println("--------------------------");
            System.out.println(book.toString());
        }
    }
}
