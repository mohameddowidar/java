package com.library.management.system.front;

import com.library.management.system.model.Book;
import com.library.management.system.model.Library;
import com.library.management.system.model.User;
import com.library.management.system.services.LibraryService;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int userId;
        Scanner input = new Scanner(System.in);
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        Library library = new Library("", "", dummyBooks());
        LibraryService libraryService = new LibraryService(library);
        boolean flag = true;
        while (flag) {
            displayMenu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter book ID : ");
                    int id = input.nextInt();
                    System.out.println("Enter book title : ");
                    String title = input.next();
                    System.out.println("Enter book author name");
                    String author = input.next();
                    System.out.println("Enter book version");
                    int version = input.nextInt();
                    Book book = new Book(id, title, author, version, true);
                    libraryService.addBook(book);
                    break;
                case 2:
                    System.out.println("Enter Book ID");
                    int removedBookID = input.nextInt();
                    libraryService.deleteBook(removedBookID);
                    break;
                case 3:
                    System.out.println("Enter your ID");
                    userId = input.nextInt();
                    System.out.println("Enter your name");
                    String userName = input.next();
                    User user = new User(userId, userName, borrowedBooks);
                    libraryService.addUser(user);
                    System.out.println("Enter Book ID");
                    int borrowedBookId = input.nextInt();
                    libraryService.getABorrowBook(borrowedBookId, user.getUserId());
                    break;
                case 4:
                    System.out.println("Enter your ID");
                    userId = input.nextInt();
                    System.out.println("Enter Book ID");
                    int returnBookId = input.nextInt();
                    libraryService.returnBook(returnBookId, userId);
                    break;
                case 5:
                    libraryService.displayBooks();
                    break;
                case 6:
                    libraryService.displayBorrowedBook();
                    break;
                case 7:
                    System.out.println("Enter Book ID");
                    int bookId = input.nextInt();
                    libraryService.displayBookDetails(bookId);
                    break;
                case 8:
                    flag = false;
            }
        }
    }

    public static void displayMenu() {
        System.out.println(
                "1- add a new book to the library.\n" +
                        "2- remove a book from the library.\n" +
                        "3- check out a book.\n" +
                        "4- return a book.\n" +
                        "5- display the list of available books.\n" +
                        "6- display the list of borrowed books.\n" +
                        "7- display the book details of a specific book.\n" +
                        "8- Exit"
        );
    }
    public static ArrayList<Book> dummyBooks(){
        ArrayList<Book> bookList= new ArrayList<>();
        Book book1= new Book(1,"1","1",1,true);
        Book book2 =new Book(2,"1","1",1,true);
        Book book3 = new Book(3,"1","1",1,true);
        Book book4 = new Book(4,"1","1",1,true);
        Book book5 = new Book(5,"1","1",1,true);
        Book book6= new Book(6,"1","1",1,true);
        Book book7= new Book(7,"1","1",1,true);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        return bookList;
    }
}
