package dtalalaev.labs.laba1.comparator;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BookComp book1 = (BookComp) o1;
        BookComp book2 = (BookComp) o2;
        int titleComparison = book1.getTitle().compareTo(book2.getTitle());
        if (titleComparison == 0) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
        return titleComparison;
    }
}
