import java.util.HashSet;
import java.util.Set;

// Many-to-Many Relationship

class Author {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Author(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        book.addAuthor(this);
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Set<Author> authors = new HashSet<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }
}

public class AuthorsBooks {

    public static void main(String[] args) {
        // Creating instances
        Author author1 = new Author("Author A");
        Author author2 = new Author("Author B");
        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book 2");

        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book1);

        System.out.println("Books by " + author1.getName() + ":");
        for (Book book : author1.getBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("Authors of " + book1.getTitle() + ":");
        for (Author author : book1.getAuthors()) {
            System.out.println(author.getName());
        }
    }
    
}
