Project: Testing with JUnit
Description: Learn how to apply automated testing in Java using JUnit 5, focusing on practical functionalities such as book management, ID (DNI) calculation, and exception handling.

📌 Exercise Breakdown
Exercise 1: Unit Testing with JUnit

Manage a library book collection with features like adding, deleting, retrieving books, and returning a sorted list.

Implement unit tests to validate the correct execution of all methods and prevent duplicates.

Exercise 2: Parameterized Testing

Create a CalculoDni class to calculate the National ID (DNI) letter based on its number.

Implement parameterized tests covering various valid and invalid cases to ensure functionality.

Exercise 3: Exception Handling

Create a method that triggers an ArrayIndexOutOfBoundsException.

Implement tests to verify that the exception is thrown correctly under expected conditions.

✨ Features
Add, remove, and query books within a collection.

Alphabetical sorting of the collection without modifying the original list.

DNI letter calculation with validation for invalid numbers.

Exception triggering and verification in Java.

Comprehensive Unit and Parameterized testing with JUnit 5.

🛠 Technologies
Backend: Java, JUnit 5

Build Tool: Maven

🚀 Installation & Execution
Clone the repository:
git clone <repository-link>

Environment Variables:
Create a .env file with the necessary configurations (if database connection is required).

Running the Application:

Compile with Maven: mvn compile

Run Tests: mvn test

Testing: JUnit tests are located in src/test/java. Run all tests to validate class behavior.

🧩 Diagrams & Technical Decisions
Modular Class Structure: Separate classes for each functionality (LibraryManager, CalculoDni, ArrayExceptionExample).

Separation of Concerns: Using unit and parameterized tests to keep logic and validation distinct.

Data Integrity: Prevention of duplicates and secure handling of collections.

Exception Safety: Validation of invalid values and control of predictable errors.
