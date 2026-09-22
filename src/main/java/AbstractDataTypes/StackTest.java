/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

public class StackTest {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int result = stack.pop();

        System.out.println("Popped element: " + result);

        if (result == 30) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}