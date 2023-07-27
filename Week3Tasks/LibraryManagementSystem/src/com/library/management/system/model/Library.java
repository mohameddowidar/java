package com.library.management.system.model;

import java.util.ArrayList;

public class Library {
   private String libraryName;
   private String libraryCode;
   private ArrayList<Book> libraryBooks;

    public Library(String libraryName, String libraryCode, ArrayList<Book> books) {
        this.libraryName = libraryName;
        this.libraryCode = libraryCode;
        this.libraryBooks = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }

    public ArrayList<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(ArrayList<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", libraryCode='" + libraryCode + '\'' +
                ", libraryBooks=" + libraryBooks +
                '}';
    }
}
