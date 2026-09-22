/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AbstractDataTypes;
// Defining a Stack ADT   public 
interface Stack<T> {
void push(T item); // Adds an element to the top    T 
T pop(); // Removes and returns the top element    T 
T peek(); // Returns the top element 
boolean isEmpty(); // Checks whether stack is empty    int 
int size(); // Returns number of elements 
}