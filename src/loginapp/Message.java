package loginapp;

public class Message {

    private final String recipient;
    private final String messageText;
    private final String messageID;
    private final int messageNumber;

    public Message(String recipient, String messageText, int messageNumber) {

        this.recipient = recipient;
        this.messageText = messageText;
        this.messageNumber = messageNumber;

        this.messageID = generateMessageID();
    }

    // Generate Message ID
    public final String generateMessageID() {

        int random = (int)(Math.random() * 900000000) + 100000000;

        return String.valueOf(random);
    }

    // Validate recipient number
    public boolean checkRecipientCell() {
        return recipient.matches("^\\+27\\d{9}$");
    }

    // Validate message length
    public boolean checkMessageLength() {
        return messageText.length() <= 250;
    }

    // Create Message Hash
    public String createMessageHash() {

        String[] words = messageText.split(" ");

        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();

        return messageNumber + ":"
                + messageID.substring(0, 2)
                + ":"
                + firstWord
                + lastWord;
    }

    public String printMessage() {

        return "\n-----------------------------------"
                + "\nMessage ID: " + messageID
                + "\nMessage Hash: " + createMessageHash()
                + "\nRecipient: " + recipient
                + "\nMessage: " + messageText
                + "\n-----------------------------------";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getMessageID() {
        return messageID;
    }

    public String getMessageHash() {
        return createMessageHash();
    }
}