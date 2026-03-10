package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library libraryA = new Library();
        libraryA.addBooksToLibrary();
        System.out.println(libraryA.showLibrary());

        Library libraryB = new Library();

        for (Book book : libraryA.getLibrary()) {
            libraryB.addBook(book);
        }
        
        libraryB.sortAlphabetic();
        System.out.println(libraryB.showLibrary());


        String name1 = libraryA.getBookByPosition(1);
        System.out.println("Name of the book search is: " + name1);
        String name2 = libraryB.getBookByPosition(1);
        System.out.println("Name of the book search is: " + name2);
    }
}
