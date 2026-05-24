package loginapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    // Recipient number test
    @Test
    public void testRecipientNumberCorrect() {

        Message msg =
                new Message(
                        "+27821990897",
                        "Hello there",
                        1);

        assertTrue(msg.checkRecipientCell());
    }

    @Test
    public void testRecipientNumberIncorrect() {

        Message msg =
                new Message(
                        "0821990876",
                        "Hello there",
                        1);

        assertFalse(msg.checkRecipientCell());
    }

    // Message length tests
    @Test
    public void testMessageLengthValid() {

        Message msg =
                new Message(
                        "+27821990897",
                        "Hello there",
                        1);

        assertTrue(msg.checkMessageLength());
    }

    @Test
    public void testMessageLengthInvalid() {

        String longMessage = "";

        for(int i=0;i<260;i++){
            longMessage += "a";
        }

        Message msg =
                new Message(
                        "+27821990897",
                        longMessage,
                        1);

        assertFalse(msg.checkMessageLength());
    }

    // Message hash
    @Test
    public void testMessageHashCreated() {

        Message msg =
                new Message(
                        "+27821990897",
                        "Hello World",
                        1);

        assertNotNull(msg.createMessageHash());
    }

    // Message ID
    @Test
    public void testMessageIDGenerated() {

        Message msg =
                new Message(
                        "+27821990897",
                        "Test message",
                        1);

        assertNotNull(msg.generateMessageID());
    }
}