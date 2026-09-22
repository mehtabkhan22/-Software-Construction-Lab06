/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AbstractDataTypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionImplementationTest {

    @Test
    void testAddStudent() {

        StudentCollection collection
                = new StudentCollectionImplementation();

        Student student
                = new Student(101, "Ali", 3.50);

        collection.addStudent(student);

        assertEquals(1, collection.getSize());
    }

    @Test
    void testFindStudent() {

        StudentCollection collection
                = new StudentCollectionImplementation();

        Student student
                = new Student(101, "Ali", 3.50);

        collection.addStudent(student);

        Student found = collection.findStudent(101);

        assertNotNull(found);
        assertEquals("Ali", found.getName());
    }

    @Test
    void testRemoveStudent() {

        StudentCollection collection
                = new StudentCollectionImplementation();

        Student student
                = new Student(101, "Ali", 3.50);

        collection.addStudent(student);
        collection.removeStudent(101);

        assertEquals(0, collection.getSize());
    }

    @Test
    void testIsEmpty() {

        StudentCollection collection
                = new StudentCollectionImplementation();

        assertTrue(collection.isEmpty());

        collection.addStudent(
                new Student(101, "Ali", 3.50)
        );

        assertFalse(collection.isEmpty());
    }
}
