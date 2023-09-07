package dtalalaev.labs.laba1.comparator;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<BookComp> {
    @Override
    public int compare(BookComp book2, BookComp book1) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison == 0) {
            int titleComparison = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparison == 0) {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
            return titleComparison;
        }
        return authorComparison;
    }
}