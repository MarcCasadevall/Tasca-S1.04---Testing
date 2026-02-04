import ex1.Book;
import ex1.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    void libraryIsNotNullAfterCreation() {
        Library library = new Library();
        assertNotNull(library.getLibrary());
    }

    @Test
    void sizeIsCorrectAfterAddingBooks() {
        Library library = new Library();

        library.addBook(new Book("ex1.Book A", 10));
        library.addBook(new Book("ex1.Book B", 12));
        library.addBook(new Book("ex1.Book C", 15));

        assertEquals(3, library.getLibrary().size());
    }
    @Test
    void booksAreInExpectedPosition() {
        Library library = new Library();

        library.addBook(new Book("First", 10));
        library.addBook(new Book("Second", 12));

        assertEquals("First", library.getLibrary().get(0).getName());
        assertEquals("Second", library.getLibrary().get(1).getName());
    }
    @Test
    void getBookByPositionReturnsCorrectTitle() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", 30));

        Book book = library.getLibrary().get(0);

        assertEquals("Clean Code", book.getName());
    }
    @Test
    void addBookAtSpecificPosition() {
        Library library = new Library();

        library.addBook(new Book("A", 10));
        library.addBook(new Book("C", 10));

        library.getLibrary().add(1, new Book("B", 10));

        assertEquals("B", library.getLibrary().get(1).getName());
    }
    @Test
    void deleteBookReducesSize() {
        Library library = new Library();

        library.addBook(new Book("A", 10));
        library.addBook(new Book("B", 10));

        library.deleteBook("A");

        assertEquals(1, library.getLibrary().size());
    }
    @Test
    void booksAreSortedAlphabetically() {
        Library library = new Library();

        library.addBook(new Book("Z", 10));
        library.addBook(new Book("A", 10));

        library.sortAlphabetic();

        assertEquals("A", library.getLibrary().get(0).getName());
        assertEquals("Z", library.getLibrary().get(1).getName());
    }
    @Test
    void duplicateBooksAreNotAllowed() {
        Library library = new Library();

        library.addBook(new Book("Duplicate", 10));
        library.addBook(new Book("Duplicate", 20));

        assertEquals(1, library.getLibrary().size());
    }
}

