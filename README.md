# Lab Task 06 – Abstract Data Types (ADT)

## Software Construction

**University:** University of Engineering and Technology, Abbottabad Campus
**Semester:** 5th Semester – Software Engineering
**Date:** 22 September 2026
**Topic:** Abstract Data Types (ADT)

---

## Objective

The objective of this lab is to implement simple Abstract Data Types (ADTs) in Java, use interfaces to define contracts, and apply the principles of abstraction and encapsulation.

This lab demonstrates how an ADT defines **what** operations are available while the concrete implementation defines **how** those operations are performed.

---

## Technologies Used

* Java
* NetBeans IDE
* Maven
* JUnit 5
* Java Collections Framework
* GitHub

---

## Project Structure

```text
ADTLab
│
├── Source Packages
│   └── AbstractDataTypes
│       ├── Stack.java
│       ├── ArrayStack.java
│       ├── StackTest.java
│       ├── Student.java
│       ├── StudentTest.java
│       ├── AbstractionTest.java
│       ├── LibrarySystem.java
│       ├── LibraryImplementation.java
│       ├── LibraryTest.java
│       ├── StudentCollection.java
│       ├── StudentCollectionImplementation.java
│       └── StudentCollectionTest.java
│
└── Test Packages
    └── AbstractDataTypes
        └── StudentCollectionImplementationTest.java
```

---

# Lab Tasks Completed

## Task 1 – Implementing the Stack ADT

The Stack ADT was implemented using the provided `ArrayStack` implementation.

The Stack follows the **LIFO (Last In, First Out)** principle.

The following operations were tested:

```text
push(10)
push(20)
push(30)
```

After inserting the three values, `pop()` was called.

Expected result:

```text
30
```

because 30 was the last element inserted.

---

## Task 2 – Data Encapsulation

A `Student` class was created with private fields:

```java
private int id;
private String name;
private double cgpa;
```

Public getter methods were implemented:

```text
getId()
getName()
getCgpa()
```

Direct access to the private variables from outside the class was tested to demonstrate that the internal data is protected.

---

## Task 3 – Programming to an Abstraction

Java's `List` interface was used to demonstrate programming to an abstraction.

The list was first implemented using:

```java
students = new ArrayList<>();
```

and later the same variable was assigned:

```java
students = new LinkedList<>();
```

The variable was declared as:

```java
List<String> students;
```

This demonstrates that client code can depend on the `List` abstraction rather than a specific implementation.

---

## Task 4 – Library System ADT Design

A `LibrarySystem` interface was created to define the Library System ADT.

The interface contains the following operations:

```text
addBook()
removeBook()
searchBook()
issueBook()
returnBook()
```

The Library System works with the following book information:

* Book ID
* Title
* Author

A concrete class named `LibraryImplementation` was created to implement the interface.

An `ArrayList` was used as the collection for storing books.

---

## Task 5 – Student Management System

A `StudentCollection` interface was created with the following operations:

```text
addStudent(Student student)
removeStudent(int id)
findStudent(int id)
getSize()
isEmpty()
```

The interface was implemented by:

```text
StudentCollectionImplementation
```

An `ArrayList<Student>` was used to store student objects.

The operations were tested using a normal Java test program and JUnit tests.

### JUnit Tests

The following operations were validated using JUnit:

* Adding a student
* Finding a student
* Removing a student
* Checking whether the collection is empty

All implemented tests were executed to verify the Student Management System.

---

# How to Run the Project

## 1. Open the Project

Open **NetBeans IDE** and open the Maven project:

```text
ADTLab
```

---

## 2. Build the Project

Right-click the project and select:

```text
Clean and Build
```

or run:

```text
mvn clean install
```

---

## 3. Run Individual Tasks

The test classes can be executed from the `AbstractDataTypes` package.

### Stack Test

Run:

```text
StackTest.java
```

It verifies that:

```text
push(10)
push(20)
push(30)
pop() → 30
```

### Student Test

Run:

```text
StudentTest.java
```

It demonstrates the Student class and getter methods.

### Abstraction Test

Run:

```text
AbstractionTest.java
```

It demonstrates the use of `List` with both `ArrayList` and `LinkedList`.

### Library Test

Run:

```text
LibraryTest.java
```

It tests the Library System operations.

### Student Collection Test

Run:

```text
StudentCollectionTest.java
```

It tests the Student Management System operations.

---

# How to Run JUnit Tests

The JUnit tests are located under:

```text
Test Packages
└── AbstractDataTypes
```

Run:

```text
StudentCollectionImplementationTest.java
```

In NetBeans:

1. Right-click the JUnit test class.
2. Select **Test File**.
3. Check the test results.
4. All implemented tests should pass successfully.

---

# Concepts Demonstrated

This lab demonstrates the following concepts:

### Abstract Data Type

An ADT defines the operations and behavior of a data type without specifying its concrete implementation.

### Abstraction

Abstraction focuses on what an object or data type can do while hiding implementation details.

### Encapsulation

Encapsulation protects internal data by restricting direct access and providing controlled methods for accessing it.

### Interface

Java interfaces are used to define contracts for ADTs.

### Concrete Implementation

Concrete classes implement the operations defined by the interfaces.

### LIFO

The Stack ADT follows the:

```text
Last In, First Out
```

principle.

### Programming to an Abstraction

The `List` interface allows the same client code to work with different implementations such as `ArrayList` and `LinkedList`.

---

# Testing

Testing was performed for the implemented ADTs.

The following were tested:

* Stack `push()` and `pop()`
* Student encapsulation
* List abstraction
* Library System operations
* Student Collection operations
* JUnit tests for Student Collection

---

# Repository Contents

This repository contains:

* Java source code
* Java interfaces
* Concrete implementations
* Normal test programs
* JUnit test files
* Project documentation
* This `README.md` file

---

# Learning Outcomes

After completing this lab, the following concepts were practiced:

* Defining Abstract Data Types
* Using Java interfaces as contracts
* Implementing ADTs using concrete classes
* Applying encapsulation
* Programming to abstractions
* Using Java collections
* Designing Library and Student Management ADTs
* Writing and executing JUnit tests

---

# Author

**Muhammad Mehtab**

**BSc Software Engineering – 5th Semester**

University of Engineering and Technology, Abbottabad Campus

