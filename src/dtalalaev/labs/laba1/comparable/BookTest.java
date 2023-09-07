package dtalalaev.labs.laba1.comparable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testCompareTo_SameIsbn() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);
        Book book2 = new Book("Book2", "Author2", 15, 12345);

        assertEquals(0, book1.compareTo(book2));
    }

    @Test
    void testCompareTo_LowerIsbn() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);
        Book book2 = new Book("Book2", "Author2", 15, 54321);

        assertTrue(book1.compareTo(book2) < 0);
    }

    @Test
    void testCompareTo_HigherIsbn() {
        Book book1 = new Book("Book1", "Author1", 10, 54321);
        Book book2 = new Book("Book2", "Author2", 15, 12345);

        assertTrue(book1.compareTo(book2) > 0);
    }

    @Test
    void testCompareTo_SameBook() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);

        assertEquals(0, book1.compareTo(book1));
    }

    @Test
    void testCompareTo_Null() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);

        assertThrows(NullPointerException.class, () -> book1.compareTo(null));
    }

    @Test
    void testSortingAscending() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);
        Book book2 = new Book("Book2", "Author2", 15, 54321);
        Book book3 = new Book("Book3", "Author3", 20, 98765);

        Book[] books = {book3, book2, book1};
        Book[] expectedOrder = {book1, book2, book3};

        Arrays.sort(books);

        assertArrayEquals(expectedOrder, books);
    }

    @Test
    void testSortingDescending() {
        Book book1 = new Book("Book1", "Author1", 10, 12345);
        Book book2 = new Book("Book2", "Author2", 15, 54321);
        Book book3 = new Book("Book3", "Author3", 20, 98765);

        Book[] books = {book1, book2, book3};
        Book[] expectedOrder = {book3, book2, book1};

        Arrays.sort(books, Collections.reverseOrder());

        assertArrayEquals(expectedOrder, books);
    }

}