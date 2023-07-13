package com.library.management.system.services;

import com.library.management.system.model.Book;
import com.library.management.system.model.Library;
import com.library.management.system.model.User;

import java.util.ArrayList;

public class LibraryService implements ILibraryService {

    private Library library;
    private ArrayList<User> users;

    public LibraryService(Library library) {
        this.library = library;
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void addBook(Book book) {
        library.getLibraryBooks().add(book);
        System.out.println("book added successfully");
        System.out.println("***********************");
    }

    @Override
    public void deleteBook(int id) {
        int count = 0;
        for (Book obj : library.getLibraryBooks()) {
            if (obj.getBookID() == id) {
                count++;
                library.getLibraryBooks().remove(obj);
                System.out.println("book removed successfully");
                System.out.println("***********************");
                break;
            }
        }
        if (count == 0) {
            System.err.println("the id not matched");
            System.err.println("********************");
        }
    }

    @Override
    public void getABorrowBook(int id, int userId) {
        int countId = 0;
        boolean isUserFound = false;
        for (User user : this.users) {
            if (user.getUserId() == userId) {
                isUserFound = true;
                for (Book obj : library.getLibraryBooks()) {
                    if (obj.getBookID() == id) {
                        countId++;
                        user.getBorrowedBooks().add(obj);
                        obj.setAvailabilityStatus(false);
                        System.out.println("book borrowed successfully");
                        System.out.println("***********************");
                        break;
                    }
                }
                break;
            }
        }
        if (!isUserFound){
            System.err.println("the user not found");
            System.err.println("********************");
        } else {
            if (countId == 0) {
                System.err.println("the id not matched");
                System.err.println("********************");
            }
        }

    }

    @Override
    public void returnBook(int id, int userId) {
        int countId = 0;
        boolean isUserFound = false;
        for (User user : this.users) {
            if (user.getUserId() == userId) {
                isUserFound = true;
                for (Book obj : library.getLibraryBooks()) {
                    if (obj.getBookID() == id) {
                        countId++;
                        user.getBorrowedBooks().remove(obj);
                        obj.setAvailabilityStatus(true);
                        System.out.println("book returned successfully");
                        System.out.println("***********************");
                        break;
                    }
                }
            }
        }
        if (!isUserFound){
            System.err.println("the user not found");
            System.err.println("********************");
        } else {
            if (countId == 0) {
                System.err.println("the id not matched");
                System.err.println("********************");
            }
        }
    }

    @Override
    public void displayBooks() {
        boolean isFound = false;
        for (Book obj : library.getLibraryBooks()) {
            if (obj.isAvailabilityStatus() == true) {
                isFound = true;
                System.out.println(obj.toString());
            }
        }
        if (!isFound) {
            System.err.println("there is no books");
            System.err.println("********************");
        }
    }

    @Override
    public void displayBorrowedBook() {
        boolean isFound = false;
        for (Book obj : library.getLibraryBooks()) {
            if (!obj.isAvailabilityStatus()) {
                isFound = true;
                System.out.println(obj.toString());
            }
        }
        if (!isFound) {
            System.err.println("there is no borrowed books");
            System.err.println("********************");
        }
    }

    @Override
    public void displayBookDetails(int id) {
        boolean isFound = false;
        for (Book obj : library.getLibraryBooks()) {
            if (obj.getBookID() == id) {
                isFound = true;
                System.out.println(obj.toString());
                break;
            }
        }
        if (!isFound){
            System.err.println("the book not found");
            System.err.println("********************");
        }
    }

}