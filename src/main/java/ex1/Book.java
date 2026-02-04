package ex1;

public class Book implements Comparable<Book>{

    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "This book: " + " " +
                name + " cost " + price;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }
}
