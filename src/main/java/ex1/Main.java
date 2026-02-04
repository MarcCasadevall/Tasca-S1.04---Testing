package ex1;

public class Main {
    public static void main(String[] args) {
        Library libraryA = new Library();

        libraryA.addBooksToLibrary();
        libraryA.sortAlphabetic();
        System.out.println(libraryA.showLibrary());
    }
}
