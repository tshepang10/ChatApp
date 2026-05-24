package loginapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=================================");
        System.out.println("        WELCOME TO CHATAPP");
        System.out.println("=================================");

        // =========================
        // REGISTRATION
        // =========================

        System.out.println("\n=== REGISTRATION ===");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        String username;

        while (true) {

            System.out.print("Enter username: ");
            username = input.nextLine();

            if (login.checkUsername(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username incorrectly formatted.");
            }
        }

        String password;

        while (true) {

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (login.checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password incorrectly formatted.");
            }
        }

        String cell;

        while (true) {

            System.out.print("Enter SA phone number (+27...): ");
            cell = input.nextLine();

            if (login.checkCellPhoneNumber(cell)) {
                System.out.println("Cell phone number successfully added.");
                break;
            } else {
                System.out.println("Cell number incorrectly formatted.");
            }
        }

        System.out.println(
                login.registerUser(
                        firstName,
                        username,
                        password,
                        cell));

        // =========================
        // LOGIN
        // =========================

        boolean success = false;

        System.out.println("\n=== LOGIN ===");

        while (!success) {

            System.out.print("Enter username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter password: ");
            String loginPass = input.nextLine();

            success = login.login(loginUser, loginPass);

            System.out.println(
                    login.returnLoginStatus(success));
        }

        // =========================
        // CHAT MENU
        // =========================

        Message[] messages = new Message[100];
        int messageCount = 0;

        int option;

        do {

            System.out.println("\n========== CHAT MENU ==========");
            System.out.println("1. Send Messages");
            System.out.println("2. Show Sent Messages");
            System.out.println("3. Quit");

            System.out.print("Choose option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:

                    System.out.print(
                            "Enter recipient number: ");

                    String recipient =
                            input.nextLine();

                    System.out.print(
                            "Enter message: ");

                    String text =
                            input.nextLine();

                    Message message =
                            new Message(
                                    recipient,
                                    text,
                                    messageCount + 1);

                    if (message.checkRecipientCell()
                            && message.checkMessageLength()) {

                        messages[messageCount] =
                                message;

                        messageCount++;

                        System.out.println(
                                "Message sent successfully.");

                        System.out.println(
                                message.printMessage());

                    } else {

                        System.out.println(
                                "Invalid message details.");
                    }

                    break;

                case 2:

                    System.out.println(
                            "\n===== SENT MESSAGES =====");

                    if (messageCount == 0) {

                        System.out.println(
                                "No messages available.");
                    }

                    for (int i = 0;
                            i < messageCount;
                            i++) {

                        System.out.println(
                                messages[i]
                                        .printMessage());
                    }

                    break;

                case 3:

                    System.out.println(
                            "Thank you for using ChatApp.");

                    break;

                default:

                    System.out.println(
                            "Invalid option.");
            }

        } while (option != 3);

    }
}