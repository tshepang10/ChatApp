package loginapp;

public class MessageManager {

    private Message[] sentMessages = new Message[100];
    private Message[] storedMessages = new Message[100];
    private Message[] disregardedMessages = new Message[100];

    private int sentCount = 0;
    private int storedCount = 0;
    private int disregardCount = 0;

    public void addSentMessage(Message message) {
        sentMessages[sentCount++] = message;
    }

    public void addStoredMessage(Message message) {
        storedMessages[storedCount++] = message;
    }

    public void addDisregardedMessage(Message message) {
        disregardedMessages[disregardCount++] = message;
    }

    public String displayLongestMessage() {

        if (storedCount == 0) {
            return "No stored messages.";
        }

        Message longest = storedMessages[0];

        for (int i = 1; i < storedCount; i++) {

            if (storedMessages[i].getMessageText().length()
                    > longest.getMessageText().length()) {

                longest = storedMessages[i];
            }
        }

        return longest.getMessageText();
    }

    public String searchByMessageID(String id) {

        for (int i = 0; i < storedCount; i++) {

            if (storedMessages[i].getMessageID().equals(id)) {

                return "Recipient: "
                        + storedMessages[i].getRecipient()
                        + "\nMessage: "
                        + storedMessages[i].getMessageText();
            }
        }

        return "Message not found.";
    }

    public String searchByRecipient(String recipient) {

        String result = "";

        for (int i = 0; i < storedCount; i++) {

            if (storedMessages[i].getRecipient().equals(recipient)) {

                result += storedMessages[i].getMessageText()
                        + "\n";
            }
        }

        return result.isEmpty()
                ? "No messages found."
                : result;
    }

    public String deleteByHash(String hash) {

        for (int i = 0; i < storedCount; i++) {

            if (storedMessages[i]
                    .getMessageHash()
                    .equals(hash)) {

                for (int j = i; j < storedCount - 1; j++) {

                    storedMessages[j]
                            = storedMessages[j + 1];
                }

                storedCount--;

                return "Message successfully deleted.";
            }
        }

        return "Message not found.";
    }

    public String displayReport() {

        String report = "";

        for (int i = 0; i < storedCount; i++) {

            report += "\nHash: "
                    + storedMessages[i].getMessageHash()
                    + "\nRecipient: "
                    + storedMessages[i].getRecipient()
                    + "\nMessage: "
                    + storedMessages[i].getMessageText()
                    + "\n";
        }

        return report;
    }
}