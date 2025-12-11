import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void addReader(Reader r) {
        readers.add(r);
    }

    public void borrowBook(String title, String readerName) {
        for (Book b : books) {
            if (b.toString().contains(title) && b.isAvailable()) {
                b.borrowBook();
                System.out.println(readerName + " borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void printBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println("- " + b);
        }
    }

    public void printReaders() {
        System.out.println("Registered readers:");
        for (Reader r : readers) {
            System.out.println("- " + r);
        }
    }
}
