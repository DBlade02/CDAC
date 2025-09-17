public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + "\nISBN: " + isbn + "\n" + author.toString();
    }
}
