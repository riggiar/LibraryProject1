public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        library.addReader(new Reader("Arina"));
        library.addReader(new Reader("Alex"));

        library.printBooks();
        library.printReaders();

        library.borrowBook("Harry Potter", "Arina");

        library.printBooks();
    }
}
