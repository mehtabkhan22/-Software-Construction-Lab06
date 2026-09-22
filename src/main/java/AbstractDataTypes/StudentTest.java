/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

/**
 *
 * @author Rana
 */
public class StudentTest {


    public static void main(String[] args) {

        Student student = new Student(101, "Ali", 3.50);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student CGPA: " + student.getCgpa());
    }
}
