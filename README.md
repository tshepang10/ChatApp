# ChatApp
A console-based Java application that implements user registration and login with validation for username, password, and South African cell phone numbers, including JUnit tests.
## Project Overview

This is a Java console-based chat application developed using Object-Oriented Programming (OOP) principles. The application was developed in phases, beginning with user registration and login functionality and later extending into a messaging system.

The system validates usernames, passwords, and South African cell phone numbers before allowing access. Once users successfully log in, they can interact with a menu-driven messaging system through the console.

The project includes structured classes and methods, input validation, and unit testing to ensure functionality and reliability.

## Features
## Part 1
- Console-based user interaction (no GUI)
- User registration and login system
- Username validation (must contain "_" and be ≤ 5 characters)
- Password complexity validation
- South African cell phone number validation (+27 format)
- Input validation using conditional statements
- Secure login verification
- Structured code using classes and methods
- JUnit testing for all major functions

## Part 2 
- Chat menu system
- Send messages
- Display sent messages
- Message ID generation
- Message hash generation
- Recipient phone number validation
- Message length validation (maximum 250 characters)
- Message storage using arrays
- Console menu navigation

## How to Run
1. Open the project in NetBeans.
2. Build the project.
3. Run the Main.java file.
4. Register a user account.
5. Log in using registered details.
6. Access the chat menu.
7. Send and view messages.

## Example Inputs
Username:
kyl_1

Password:
#Ch4rles

Cell Phone:
+27821990897

Message Recipient:
+27831234567

Message:
Hello, welcome to ChatApp

## Chat Menu
1. Send Messages
2. Show Sent Messages
3. Quit

## Unit Testing
JUnit tests are implemented to validate:
## Login System
- Username formatting
- Password complexity
- Cell phone number validation
- Registration functionality
- Login success and failure
## Messaging System
- Recipient number validation
- Message length validation
- Message ID generation
- Message hash generation

## Future Improvements
- Store multiple users
- Save messages to files or databases
- Add received messages functionality
- Add search functionality
- Extend into a complete chat platform

  ## References
## Part 1
Oracle, 2023. *Java Documentation*. [online] Available at: <https://docs.oracle.com/javase/> [Accessed 5 Apr. 2026].

Oracle, 2023. *Class String (Java Platform SE)*. [online] Available at: <https://docs.oracle.com/javase/8/docs/api/java/lang/String.html> [Accessed 5 Apr. 2026].

GeeksforGeeks, 2024. *Java Regular Expressions*. [online] Available at: <https://www.geeksforgeeks.org/regular-expressions-in-java/> [Accessed 5 Apr. 2026].

Mkyong, 2023. *Java Regex for Phone Number Validation*. [online] Available at: <https://mkyong.com/regular-expressions/how-to-validate-phone-number-with-regular-expression/> [Accessed 5 Apr. 2026].

JUnit, 2024. *JUnit 4 Documentation*. [online] Available at: <https://junit.org/junit4/> [Accessed 5 Apr. 2026].

Regexr, 2024. *Regular Expression Tester*. [online] Available at: <https://regexr.com/> [Accessed 5 Apr. 2026].

## Part 2 
Oracle, 2023. Java Documentation. [online] Available at: https://docs.oracle.com/javase/ [Accessed 24 May 2026].

Oracle, 2023. Class String (Java Platform SE). [online] Available at: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html [Accessed 24 May 2026].

Oracle, 2023. Math Class (Java Platform SE). [online] Available at: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html [Accessed 24 May 2026].

GeeksforGeeks, 2024. Java Regular Expressions. [online] Available at: https://www.geeksforgeeks.org/regular-expressions-in-java/ [Accessed 24 May 2026].

Mkyong, 2023. Java Regex for Phone Number Validation. [online] Available at: https://mkyong.com/regular-expressions/how-to-validate-phone-number-with-regular-expression/ [Accessed 24 May 2026].

JUnit, 2024. JUnit 4 Documentation. [online] Available at: https://junit.org/junit4/ [Accessed 24 May 2026].

Regexr, 2024. Regular Expression Tester. [online] Available at: https://regexr.com/ [Accessed 24 May 2026].

NetBeans, 2024. Apache NetBeans Documentation. [online] Available at: https://netbeans.apache.org/kb/ [Accessed 24 May 2026].

