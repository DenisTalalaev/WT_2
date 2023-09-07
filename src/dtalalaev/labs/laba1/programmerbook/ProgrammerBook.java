package dtalalaev.labs.laba1.programmerbook;

import dtalalaev.labs.laba1.book.Book;


public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public boolean equals(Object book2) {
        ProgrammerBook book = (ProgrammerBook) book2;
        return level == book.level &&
                language.equals(book.language) &&
                super.equals(book);
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(Integer.valueOf(level).hashCode() + language.hashCode() + super.hashCode()).hashCode();
    }

    @Override
    public String toString() {
        return "Programmer " + super.toString() + " has level " + level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ProgrammerBook(String language, int level, String title, String author, int price) {
        super(title, author, price);
        this.level = level;
        this.language = language;
    }


}
