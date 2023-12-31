package dtalalaev.labs.laba1.book;


public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }

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
                    author.equals(book.author);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(title.hashCode() + Integer.valueOf(price).hashCode() + author.hashCode()).hashCode();
    }

    @Override
    public String toString() {
        return "Book " + title + " written by " + author + " costs " + price;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
}
