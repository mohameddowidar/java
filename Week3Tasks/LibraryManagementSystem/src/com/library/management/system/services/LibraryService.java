package com.library.management.system.services;

import com.library.management.system.model.Book;
import com.library.management.system.model.Library;
import com.library.management.system.model.User;

import java.util.ArrayList;

public class LibraryService {

    private Library library;
    private ArrayList<User> users;

    public LibraryService(Library library) {
        this.library = library;
        this.users= new ArrayList<>();
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public void addBook(Book book) {
        library.getLibraryBooks().add(book);
        System.out.println("book added successfully");
        System.out.println("***********************");
    }

    public void deleteBook(int id) {
        for (Book obj : library.getLibraryBooks()) {
            if (obj.getBookID() == id) {
                library.getLibraryBooks().remove(obj);
                System.out.println("book removed successfully");
                System.out.println("***********************");
                break;
            }
        }
    }

    public void getABorrowBook(int id, int userId) {
        for (User user :this.users) {
            if(user.getUserId() == userId){
                for (Book obj : library.getLibraryBooks()) {
                    if (obj.getBookID() == id) {
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
    }

    public void returnBook(int id, int userId) {
        for (User user :this.users) {
            if (user.getUserId() == userId) {
                for (Book obj : library.getLibraryBooks()) {
                    if (obj.getBookID() == id) {
                        user.getBorrowedBooks().remove(obj);
                        obj.setAvailabilityStatus(true);
                        System.out.println("book returned successfully");
                        System.out.println("***********************");
                        break;
                    }
                }
            }
        }
    }

    public void displayBooks() {
        for (Book obj : library.getLibraryBooks()) {
            if (obj.isAvailabilityStatus() == true) {
                System.out.println(obj.toString());
            }
        }
    }

    public void displayBorrowedBook() {
        for (Book obj : library.getLibraryBooks()) {
            if(!obj.isAvailabilityStatus()){
                System.out.println(obj.toString());
            }
        }
    }

    public void displayBookDetails(int id) {
        for (Book obj : library.getLibraryBooks()) {
            if (obj.getBookID() == id) {
                System.out.println(obj.toString());
                break;
            }
        }
    }

}