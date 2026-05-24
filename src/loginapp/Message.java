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

    // Generate message ID
    public final String generateMessageID() {

        int random = (int)(Math.random() * 900000000) + 100000000;
        return String.valueOf(random);
    }

    // Check recipient format
    public boolean checkRecipientCell() {
        return recipient.matches("^\\+27\\d{9}$");
    }

    // Check message length
    public boolean checkMessageLength() {
        return messageText.length() <= 250;
    }

    // Create message hash
    public String createMessageHash() {

        String[] words = messageText.split(" ");

        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();

        return messageNumber + ":" 
                + messageID.substring(0,2)
                + ":" 
                + firstWord 
                + lastWord;
    }

    // Display message details
    public String printMessage() {

        return """
               -----------------------------------
               Message ID: """ + messageID
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
}