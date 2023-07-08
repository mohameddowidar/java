package com.library.management.system.model;

import java.util.ArrayList;

public class User {
    private int userId ;
    private String userName;
    private ArrayList<Book> borrowedBooks;

    public User(int userId, String userName, ArrayList<Book> borrowedBooks) {
        this.userId = userId;
        this.userName = userName;
        this.borrowedBooks = borrowedBooks;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
