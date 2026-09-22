/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

public class StudentCollectionTest {

    public static void main(String[] args) {

        StudentCollection collection =
                new StudentCollectionImplementation();

        Student s1 = new Student(101, "Ali", 3.50);
        Student s2 = new Student(102, "Ahmed", 3.70);

        collection.addStudent(s1);
        collection.addStudent(s2);

        System.out.println("Size: " + collection.getSize());

        Student found = collection.findStudent(101);

        if (found != null) {
            System.out.println("Student found: "
                    + found.getName());
        }

        collection.removeStudent(102);

        System.out.println("Size after removal: "
                + collection.getSize());

        System.out.println("Is empty: "
                + collection.isEmpty());
    }
}