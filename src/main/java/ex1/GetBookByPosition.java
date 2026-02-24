package ex1;

import java.util.ArrayList;

public class GetBookByPosition {
    public String getBookByPosition(Library library, int index) {
        ArrayList<Book> list = library.getLibrary();
        if (index >= 0 && index < list.size()) {
            return list.get(index).getName();
        }else {
            return "OutOfBounds";
        }
    }
}
