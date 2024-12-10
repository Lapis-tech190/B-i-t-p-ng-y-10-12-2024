import java.util.List;

public interface BookManager {
    void addBook(Book book);
    void removeBook(String bookId);
    List<Book> searchBooks(String query);
    List<Book> getAllBooks();
}
