/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractionTest {

    public static void main(String[] args) {

        List<String> students;

        students = new ArrayList<>();
        students.add("Ali");

        System.out.println("ArrayList:");
        System.out.println(students);

        students = new LinkedList<>();
        students.add("Ahmed");

        System.out.println("LinkedList:");
        System.out.println(students);
    }
}
