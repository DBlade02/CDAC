public class Main {
    public static void main(String[] args) {
        // Create Authors
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com");
        Author author2 = new Author("George R.R. Martin", "grrmartin@example.com");

        // Create Books
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "97804", author1);
        Book book2 = new Book("A Game of Thrones", "97805", author2);

        // Create Library
        Library library = new Library("MY LIbrary");

        // Add books
        library.addBook(book1);
        library.addBook(book2);

        // Display full library info
        library.displayLibraryInfo();

        System.out.println("\n--- Accessing Author Info from Book Directly ---");
        System.out.println("Book: " + book1.getAuthor().getName());
        System.out.println("Author Email: " + book1.getAuthor().getEmail());
    }
}
