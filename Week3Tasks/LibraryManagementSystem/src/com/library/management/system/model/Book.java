package com.library.management.system.model;

public class Book {
    private int bookID;
    private String bookTitle;
    private String authorName;
    private int bookVersion;
    private boolean availabilityStatus;

    public Book(int bookID, String bookTitle, String authorName, int bookVersion, boolean availabilityStatus) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.bookVersion = bookVersion;
        this.availabilityStatus = availabilityStatus;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookVersion() {
        return bookVersion;
    }

    public void setBookVersion(int bookVersion) {
        this.bookVersion = bookVersion;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookVersion=" + bookVersion +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}
