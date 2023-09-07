package dtalalaev.labs.laba1.comparator;

import java.util.Comparator;

public class BookTitleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BookComp book1 = (BookComp) o1;
        BookComp book2 = (BookComp) o2;
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
