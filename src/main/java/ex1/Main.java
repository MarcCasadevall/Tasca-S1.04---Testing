package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library libraryA = new Library();
        libraryA.addBooksToLibrary();
        System.out.println(libraryA.showLibrary());

        Library libraryB = new Library();
        libraryB.setLibrary(new ArrayList<>(libraryA.getLibrary()));
        libraryB.sortAlphabetic();
        System.out.println(libraryB.showLibrary());

       GetBookByPosition searchBook = new GetBookByPosition();
       String name1 = searchBook.getBookByPosition(libraryA,1);
        System.out.println("Name of the book search is: " + name1);
        String name2 = searchBook.getBookByPosition(libraryB,1);
        System.out.println("Name of the book search is: " + name2);
    }
}
