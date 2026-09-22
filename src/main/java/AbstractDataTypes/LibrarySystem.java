/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AbstractDataTypes;

public interface LibrarySystem {

    void addBook(int bookId, String title, String author);

    void removeBook(int bookId);

    void searchBook(int bookId);

    void issueBook(int bookId);

    void returnBook(int bookId);
}
