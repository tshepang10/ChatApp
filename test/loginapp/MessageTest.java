package loginapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void testRecipientNumberCorrect() {

        Message msg =
                new Message(
                        "+27821234567",
                        "Hello",
                        1);

        assertTrue(msg.checkRecipientCell());
    }

    @Test
    public void testRecipientNumberIncorrect() {

        Message msg =
                new Message(
                        "0821234567",
                        "Hello",
                        1);

        assertFalse(msg.checkRecipientCell());
    }

    @Test
    public void testMessageLengthValid() {

        Message msg =
                new Message(
                        "+27821234567",
                        "Hello World",
                        1);

        assertTrue(msg.checkMessageLength());
    }

    @Test
    public void testMessageLengthInvalid() {

        String longMessage = "";

        for (int i = 0; i < 260; i++) {
            longMessage += "a";
        }

        Message msg =
                new Message(
                        "+27821234567",
                        longMessage,
                        1);

        assertFalse(msg.checkMessageLength());
    }

    @Test
    public void testMessageIDGenerated() {

        Message msg =
                new Message(
                        "+27821234567",
                        "Test Message",
                        1);

        assertNotNull(msg.getMessageID());
    }

    @Test
    public void testMessageHashGenerated() {

        Message msg =
                new Message(
                        "+27821234567",
                        "Hello World",
                        1);

        assertNotNull(msg.getMessageHash());
    }
}