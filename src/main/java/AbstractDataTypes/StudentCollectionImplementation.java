/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

import java.util.ArrayList;

public class StudentCollectionImplementation
        implements StudentCollection {

    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}