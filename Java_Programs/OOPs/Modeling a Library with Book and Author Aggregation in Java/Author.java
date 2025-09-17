//Modeling a Library with Book and Author Aggregation in Java
/*Detail: Implement a Java program that models a Library. 
Create classes for Library, Book, and Author. 
Ensure that the Library class aggregates a collection of Book objects, and each Book
object has an aggregation relationship with an Author object. */
public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Author Name: " + name + ", Email: " + email;
    }
}



