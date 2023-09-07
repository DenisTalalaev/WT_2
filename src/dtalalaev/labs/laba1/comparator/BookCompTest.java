package dtalalaev.labs.laba1.comparator;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookCompTest {


    @Test
    void testBookTitleComparator() {
        List<BookComp> books = new ArrayList<>();
        books.add(new BookComp("Title B", "Author A", 20));
        books.add(new BookComp("Title C", "Author C", 15));
        books.add(new BookComp("Title A", "Author B", 10));

        Comparator<BookComp> comparator = new BookTitleComparator();
        Collections.sort(books, comparator);

        assertEquals("Title A", books.get(0).getTitle());
        assertEquals("Title B", books.get(1).getTitle());
        assertEquals("Title C", books.get(2).getTitle());
    }

    @Test
    void testBookTitleComparator_SameTitleDifferentCase() {
        List<BookComp> books = new ArrayList<>();
        books.add(new BookComp("Title B", "Author A", 20));
        books.add(new BookComp("Title A", "Author C", 15));
        books.add(new BookComp("Title C", "Author B", 10));

        Comparator<BookComp> comparator = new BookTitleComparator();
        Collections.sort(books, comparator);

        assertEquals("Title A", books.get(0).getTitle());
        assertEquals("Title B", books.get(1).getTitle());
        assertEquals("Title C", books.get(2).getTitle());
    }

    @Test
    void testBookTitleAuthorComparator() {
        List<BookComp> books = new ArrayList<>();
        books.add(new BookComp("Title B", "Author A", 20));
        books.add(new BookComp("Title A", "Author B", 10));
        books.add(new BookComp("Title C", "Author A", 15));

        Comparator<BookComp> comparator = new BookTitleAuthorComparator();
        Collections.sort(books, comparator);

        assertEquals("Title A", books.get(0).getTitle());
        assertEquals("Title B", books.get(1).getTitle());
        assertEquals("Title C", books.get(2).getTitle());
    }

    @Test
    void testBookTitleAuthorComparator_SameTitleDifferentAuthor() {
        List<BookComp> books = new ArrayList<>();
        books.add(new BookComp("Title B", "Author A", 20));
        books.add(new BookComp("Title B", "Author C", 10));
        books.add(new BookComp("Title B", "Author B", 15));

        Comparator<BookComp> comparator = new BookTitleAuthorComparator();
        Collections.sort(books, comparator);

        assertEquals("Author A", books.get(0).getAuthor());
        assertEquals("Author B", books.get(1).getAuthor());
        assertEquals("Author C", books.get(2).getAuthor());
    }

    @Test
    void testBookAuthorTitlePriceComparator() {
        List<BookComp> books = new ArrayList<>();
        books.add(new BookComp("Title A", "Author B", 10));
        books.add(new BookComp("Title C", "Author A", 15));
        books.add(new BookComp("Title B", "Author A", 20));

        Comparator<BookComp> comparator = new BookAuthorTitlePriceComparator();
        Collections.sort(books, comparator);

        assertEquals("Title A", books.get(0).getTitle());
        assertEquals("Title C", books.get(1).getTitle());
        assertEquals("Title B", books.get(2).getTitle());
    }

}