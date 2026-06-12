# ChatApp
A console-based Java chat application developed using Object-Oriented Programming (OOP) principles. The application provides user registration, login, messaging functionality, message management, JSON message storage, and automated unit testing using JUnit.
## Project Overview
ChatApp is a Java console application developed in multiple phases. The project began with a secure user registration and login system and was later extended into a complete messaging platform.

The application validates usernames, passwords, and South African cell phone numbers before allowing access. After successful login, users can send messages, view sent messages, manage stored messages, generate message hashes and IDs, and perform message searches.

The project demonstrates the use of Java classes, methods, arrays, validation techniques, file handling, JSON storage, and automated testing.

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

## Part 3 
Part 3 extends the messaging functionality by introducing message management features and message storage.
The application stores messages in separate arrays:
- Sent Messages Array
- Stored Messages Array
- Disregarded Messages Array
- Message Hash Array
- Message ID Array
- Stored Messages Menu
- Users can:
Display Stored Messages
- Shows:
Sender
Recipient
- Display Longest Message
Returns the stored message with the greatest number of characters.
- Search by Message ID
Displays:
Recipient
Message Content
Search by Recipient
- Displays all messages sent to a specified recipient.
- Delete Messages
Messages can be deleted using the Message Hash.
- Generate Message Report
Displays:
Message Hash
Recipient
Message Content
JSON Storage
- Messages are stored as a JSON file for persistence and retrieval.

## Project Structure
src/
└── loginapp/
    ├── Main.java
    ├── Login.java
    ├── Message.java
    └── MessageManager.java

test/
└── loginapp/
    ├── LoginTest.java
    ├── MessageTest.java
    └── MessageManagerTest.java

## How to Run
1. Open the project in NetBeans.
2. Build the project.
3. Run the Main.java file.
4. Register a user account.
5. Log in using registered details.
6. Access the Chat Menu.
7. Send and view messages.

## Example Inputs
## Registration
First Name: Tshepang
Username: t_m
Password: #Chat123
Phone Number: +27821234567
## Login
Username: t_m
Password: #Chat123
## Message
Recipient: +27831234567
Message: Hello, welcome to ChatApp
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
## Message Manager Tests
- Sent message storage
- Longest message retrieval
- Search by Message ID
- Search by Recipient
- Delete message by Message Hash
- Message report generation
Automated Unit Testing

Automated testing is implemented using JUnit.

The tests execute automatically when:

Test File is selected in NetBeans
Test Project is selected in NetBeans
GitHub Actions workflow is executed

## Automated tests ensure:
Consistent functionality
Reduced manual testing effort
Early bug detection
Reliable code deployment

## Technologies Used
Java
NetBeans IDE
JUnit 4
JSON
Object-Oriented Programming (OOP)
GitHub
GitHub Actions

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

## Part 3

JSON.org, 2024. Introducing JSON. Available at: https://www.json.org/

Oracle, 2023. Java File Handling Documentation. Available at: https://docs.oracle.com/javase/tutorial/essential/io/

GitHub, 2024. GitHub Actions Documentation. Available at: https://docs.github.com/actions

JUnit, 2024. JUnit 4 User Guide. Available at: https://junit.org/junit4/
