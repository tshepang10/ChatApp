package loginapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=================================");
        System.out.println("        WELCOME TO CHATAPP");
        System.out.println("=================================");

        // REGISTRATION

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        String username;

        while (true) {

            System.out.print("Enter username: ");
            username = input.nextLine();

            if (login.checkUsername(username)) {
                break;
            }

            System.out.println("Username incorrectly formatted.");
        }

        String password;

        while (true) {

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (login.checkPasswordComplexity(password)) {
                break;
            }

            System.out.println("Password incorrectly formatted.");
        }

        String phone;

        while (true) {

            System.out.print("Enter SA phone number: ");
            phone = input.nextLine();

            if (login.checkCellPhoneNumber(phone)) {
                break;
            }

            System.out.println("Phone number incorrectly formatted.");
        }

        System.out.println(
                login.registerUser(
                        firstName,
                        username,
                        password,
                        phone));

        // LOGIN

        boolean loggedIn = false;

        while (!loggedIn) {

            System.out.print("Username: ");
            String loginUser = input.nextLine();

            System.out.print("Password: ");
            String loginPass = input.nextLine();

            loggedIn =
                    login.login(
                            loginUser,
                            loginPass);

            System.out.println(
                    login.returnLoginStatus(loggedIn));
        }

        // PART 3 ARRAYS

        Message[] sentMessages = new Message[100];
        Message[] storedMessages = new Message[100];
        Message[] disregardedMessages = new Message[100];

        int sentCount = 0;
        int storedCount = 0;
        int disregardCount = 0;

        int option;

        do {

            System.out.println("\n========== CHAT MENU ==========");
            System.out.println("1. Send Message");
            System.out.println("2. Show Sent Messages");
            System.out.println("3. Quit");
            System.out.println("4. Stored Messages");

            System.out.print("Choose option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Recipient: ");
                    String recipient = input.nextLine();

                    System.out.print("Message: ");
                    String text = input.nextLine();

                    Message message =
                            new Message(
                                    recipient,
                                    text,
                                    sentCount + 1);

                    if (!message.checkRecipientCell()) {

                        System.out.println(
                                "Invalid recipient number.");

                        break;
                    }

                    if (!message.checkMessageLength()) {

                        System.out.println(
                                "Message exceeds 250 characters.");

                        break;
                    }

                    sentMessages[sentCount] = message;
                    storedMessages[storedCount] = message;

                    sentCount++;
                    storedCount++;

                    System.out.println(
                            "Message sent successfully.");

                    System.out.println(
                            message.printMessage());

                    break;

                case 2:

                    System.out.println(
                            "\n===== SENT MESSAGES =====");

                    if (sentCount == 0) {

                        System.out.println(
                                "No sent messages.");
                    }

                    for (int i = 0; i < sentCount; i++) {

                        System.out.println(
                                sentMessages[i]
                                        .printMessage());
                    }

                    break;

                case 3:

                    System.out.println(
                            "Thank you for using ChatApp.");

                    break;

                case 4:

                    System.out.println(
                            "\n===== STORED MESSAGES =====");

                    if (storedCount == 0) {

                        System.out.println(
                                "No stored messages.");

                        break;
                    }

                    // Display Sender and Recipient

                    for (int i = 0; i < storedCount; i++) {

                        System.out.println(
                                "Sender: "
                                + firstName);

                        System.out.println(
                                "Recipient: "
                                + storedMessages[i]
                                        .getRecipient());

                        System.out.println();
                    }

                    // Longest Message

                    Message longest =
                            storedMessages[0];

                    for (int i = 1;
                            i < storedCount;
                            i++) {

                        if (storedMessages[i]
                                .getMessageText()
                                .length()
                                >
                                longest
                                .getMessageText()
                                .length()) {

                            longest =
                                    storedMessages[i];
                        }
                    }

                    System.out.println(
                            "Longest Message:");

                    System.out.println(
                            longest.getMessageText());

                    // Report

                    System.out.println(
                            "\n===== REPORT =====");

                    for (int i = 0;
                            i < storedCount;
                            i++) {

                        System.out.println(
                                "Hash: "
                                + storedMessages[i]
                                        .getMessageHash());

                        System.out.println(
                                "Recipient: "
                                + storedMessages[i]
                                        .getRecipient());

                        System.out.println(
                                "Message: "
                                + storedMessages[i]
                                        .getMessageText());

                        System.out.println();
                    }

                    break;

                default:

                    System.out.println(
                            "Invalid option.");
            }

        } while (option != 3);
    }
}