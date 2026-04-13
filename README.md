# ChatApp
A console-based Java application that implements user registration and login with validation for username, password, and South African cell phone numbers, including JUnit tests.
## Project Overview

This is a Java console-based login and registration system developed as part of a chat application project. 
The application allows users to register an account and log in using validated credentials.

It enforces rules for username formatting, password complexity, and South African cell phone numbers. 
The system is built using Object-Oriented Programming (OOP) principles and includes unit testing to ensure functionality and reliability.

## Features
- Console-based user interaction (no GUI)
- User registration and login system
- Username validation (must contain "_" and be ≤ 5 characters)
- Password complexity validation
- South African cell phone number validation (+27 format)
- Input validation using conditional statements
- Secure login verification
- Structured code using classes and methods
- JUnit testing for all major functions

## How to Run
1. Open the project in NetBeans.
2. Build the project.
3. Run the `Main.java` file.
4. Follow the prompts in the console to register and log in.

## Example Inputs
- Username: kyl_1
- Password: #Ch4rles
- Cell Phone: +27821990897

## Unit Testing
JUnit tests are implemented to validate:
- Username formatting
- Password complexity
- Cell phone number format
- Registration success
- Login success and failure

## Future Improvements
- Extend system into a full chat application
- Store multiple users
- Add message sending functionality

  ## References

Oracle, 2023. *Java Documentation*. [online] Available at: <https://docs.oracle.com/javase/> [Accessed 5 Apr. 2026].

Oracle, 2023. *Class String (Java Platform SE)*. [online] Available at: <https://docs.oracle.com/javase/8/docs/api/java/lang/String.html> [Accessed 5 Apr. 2026].

GeeksforGeeks, 2024. *Java Regular Expressions*. [online] Available at: <https://www.geeksforgeeks.org/regular-expressions-in-java/> [Accessed 5 Apr. 2026].

Mkyong, 2023. *Java Regex for Phone Number Validation*. [online] Available at: <https://mkyong.com/regular-expressions/how-to-validate-phone-number-with-regular-expression/> [Accessed 5 Apr. 2026].

JUnit, 2024. *JUnit 4 Documentation*. [online] Available at: <https://junit.org/junit4/> [Accessed 5 Apr. 2026].

Regexr, 2024. *Regular Expression Tester*. [online] Available at: <https://regexr.com/> [Accessed 5 Apr. 2026].
