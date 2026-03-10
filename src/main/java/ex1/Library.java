package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return Collections.unmodifiableList(library);
    }

    public void addBook(Book newBook) {
        for (Book book : this.library) {
            if (book.getName().equalsIgnoreCase(newBook.getName())) {
                System.out.println("The book already exists.");
                return;
            }
        }
        this.library.add(newBook);
    }

    public void addBookIndex(int index, Book newBook) {
        for (Book book : this.library) {
            if (book.getName().equalsIgnoreCase(newBook.getName())) {
                System.out.println("The book already exists.");
                return;
            }
        }
        this.library.add(index, newBook);
    }

    public String showLibrary() {
        return "Books in the library: " + getLibrary();
    }

    public void deleteBook(String name) {

        for (Book book : this.library) {
            if (book.getName().equalsIgnoreCase(name)) {
                this.library.remove(book);

                System.out.println("ex1.Book deleted.");
                return;
            }
        }
    }

    public int getSize() {
        return this.library.size();
    }

    public Book getBook(int index) {
        return this.library.get(index);
    }

    public String getBookByPosition(int index) {

        if (index >= 0 && index < library.size()) {
            return library.get(index).getName();
        } else {
            return "OutOfBounds";
        }
    }

    public void sortAlphabetic() {
        Collections.sort(library);
    }

    public void addBooksToLibrary() {
        library.add(new Book("Don Quijote de la Mancha", 25.55));
        library.add(new Book("Cien años de soledad ", 29.70));
        library.add(new Book("El Señor de los Anillos", 38.99));
        library.add(new Book("IT", 43.5));
    }

}
