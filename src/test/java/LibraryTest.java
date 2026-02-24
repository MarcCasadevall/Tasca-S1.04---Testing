import ex1.Book;
import ex1.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void sizeIsCorrectAfterAddingBooks() {
        Library library = new Library();

        library.addBook(new Book("Book A", 10));
        library.addBook(new Book("Book B", 12));
        library.addBook(new Book("Book C", 15));

        assertEquals(3, library.getSize());
    }

    @Test
    void booksAreInExpectedPosition() {
        Library library = new Library();

        library.addBook(new Book("First", 10));
        library.addBook(new Book("Second", 12));

        assertEquals("First", library.getBook(0).getName());
        assertEquals("Second", library.getBook(1).getName());
    }

    @Test
    void getBookByPositionReturnsCorrectTitle() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", 30));

        Book book = library.getBook(0);

        assertEquals("Clean Code", book.getName());
    }

    @Test
    void addBookAtSpecificPosition() {
        Library library = new Library();

        library.addBook(new Book("A", 10));
        library.addBook(new Book("C", 10));

        library.addBookIndex(1, new Book("B", 10));

        assertEquals("B", library.getBook(1).getName());
    }

    @Test
    void deleteBookReducesSize() {
        Library library = new Library();

        library.addBook(new Book("A", 10));
        library.addBook(new Book("B", 10));

        library.deleteBook("A");

        assertEquals(1, library.getSize());
    }

    @Test
    void booksAreSortedAlphabetically() {
        Library library = new Library();

        library.addBook(new Book("Z", 10));
        library.addBook(new Book("A", 10));

        library.sortAlphabetic();

        assertEquals("A", library.getBook(0).getName());
        assertEquals("Z", library.getBook(1).getName());
    }

    @Test
    void duplicateBooksAreNotAllowed() {
        Library library = new Library();

        library.addBook(new Book("Duplicate", 10));
        library.addBook(new Book("Duplicate", 20));

        assertEquals(1, library.getSize());
    }
}