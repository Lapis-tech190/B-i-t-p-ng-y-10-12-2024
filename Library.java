import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements BookManager {
    private String id;
    private String name;
    private List<Book> books;

    public Library(String id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public List<Book> searchBooks(String query) {
        return books.stream()
                .filter(book -> book.getTitle().contains(query) || book.getAuthor().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library [id =" + id + ", name =" + name + ", totalBooks =" + books.size() + ", books =" + books + "]";
    }
}
