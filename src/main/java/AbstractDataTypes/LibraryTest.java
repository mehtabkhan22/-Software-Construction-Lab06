/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

public class LibraryTest {

    public static void main(String[] args) {

        LibrarySystem library = new LibraryImplementation();

        library.addBook(101, "Java Programming", "James Gosling");
        library.addBook(102, "Software Engineering", "Ian Sommerville");

        library.searchBook(101);

        library.issueBook(101);

        library.returnBook(101);

        library.removeBook(102);

        library.searchBook(102);
    }
}
