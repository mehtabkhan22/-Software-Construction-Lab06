/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

import java.util.ArrayList;

public class LibraryImplementation implements LibrarySystem {

    private ArrayList<String> books = new ArrayList<>();

    @Override
    public void addBook(int bookId, String title, String author) {
        String book = bookId + " - " + title + " - " + author;
        books.add(book);

        System.out.println("Book added: " + book);
    }

    @Override
    public void removeBook(int bookId) {
        for (String book : books) {
            if (book.startsWith(bookId + " - ")) {
                books.remove(book);
                System.out.println("Book removed: " + book);
                return;
            }
        }

        System.out.println("Book not found.");
    }

    @Override
    public void searchBook(int bookId) {
        for (String book : books) {
            if (book.startsWith(bookId + " - ")) {
                System.out.println("Book found: " + book);
                return;
            }
        }

        System.out.println("Book not found.");
    }

    @Override
    public void issueBook(int bookId) {
        for (String book : books) {
            if (book.startsWith(bookId + " - ")) {
                System.out.println("Book issued: " + book);
                return;
            }
        }

        System.out.println("Book not found.");
    }

    @Override
    public void returnBook(int bookId) {
        for (String book : books) {
            if (book.startsWith(bookId + " - ")) {
                System.out.println("Book returned: " + book);
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
