package be.jimmygodin;

import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    private LocalDate publishDate;
    private int pageCount;

    private Book(String title, Author author, LocalDate publishDate, int pageCount) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPublish date: %s\nPage count: %02d",
                title, author, publishDate.toString(), pageCount );
    }

    public static class Builder {

        private String title;
        private Author author;
        private LocalDate publishDate;
        private int pageCount;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withPublishDate(LocalDate publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public Builder withPageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public Book createBook() {
            return new Book(title, author, publishDate, pageCount);
        }
    }
}
