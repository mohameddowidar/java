package com.library.management.system.services;

import com.library.management.system.model.Book;
import com.library.management.system.model.User;

 public interface ILibraryService {

     void addUser(User user);
     void addBook(Book book);

     void deleteBook(int id) ;

     void getABorrowBook(int id, int userId) ;

     void returnBook(int id, int userId) ;

     void displayBooks() ;
     void displayBorrowedBook();

     void displayBookDetails(int id);

}
