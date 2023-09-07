package dtalalaev.labs.laba1.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void testClone() {
        Book originalBook = new Book("The Catcher in the Rye", "J.D. Salinger", 15);
        Book clonedBook = originalBook.clone();
        assertNotSame(originalBook, clonedBook);
        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
    }

    @Test
    void testEquals() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12);
        assertTrue(book1.equals(book2));

        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 9);
        assertFalse(book1.equals(book3));
    }

    @Test
    void testEqualsSameObject() {
        Book book1 = new Book("1984", "George Orwell", 10);
        assertTrue(book1.equals(book1));
    }

    @Test
    void testEqualsNull() {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 14);
        assertFalse(book1.equals(null));
    }

    @Test
    void testEqualsDifferentClass() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 8);
        String otherObject = "This is a string";
        assertFalse(book1.equals(otherObject));
    }
}