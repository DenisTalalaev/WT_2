package dtalalaev.labs.laba1.comparable;

public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    public boolean equals(Object book2) {
        if (book2 == null || book2.getClass() != this.getClass()){
            return false;
        }
        Book book = (Book) book2;
        if (book.hashCode() == this.hashCode()) {
            if (this == book2) {
                return true;
            }
            return price == book.price &&
                    title.equals(book.title) &&
                    author.equals(book.author) &&
                    this.isbn == book.isbn;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book " + title + "(isbn: " + isbn + ") written by " + author + " costs " + price;
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(isbn, ((Book) o).isbn);
    }
}

