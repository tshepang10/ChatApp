package loginapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageManagerTest {

    @Test
    public void testSentMessagesArrayPopulated() {

        MessageManager manager = new MessageManager();

        Message msg =
                new Message(
                        "+27834557896",
                        "Did you get the cake?",
                        1);

        manager.addSentMessage(msg);

        assertNotNull(msg);
    }

    @Test
    public void testDisplayLongestMessage() {

        MessageManager manager = new MessageManager();

        manager.addStoredMessage(
                new Message(
                        "+27838884567",
                        "Hi",
                        1));

        manager.addStoredMessage(
                new Message(
                        "+27838884567",
                        "Where are you? You are late! I have asked you to be on time.",
                        2));

        assertEquals(
                "Where are you? You are late! I have asked you to be on time.",
                manager.displayLongestMessage());
    }

    @Test
    public void testSearchByMessageID() {

        MessageManager manager = new MessageManager();

        Message msg =
                new Message(
                        "+27838884567",
                        "Testing ID Search",
                        1);

        manager.addStoredMessage(msg);

        String result =
                manager.searchByMessageID(
                        msg.getMessageID());

        assertTrue(result.contains("Testing ID Search"));
    }

    @Test
    public void testSearchByRecipient() {

        MessageManager manager = new MessageManager();

        manager.addStoredMessage(
                new Message(
                        "+27838884567",
                        "Ok, I am leaving without you.",
                        1));

        String result =
                manager.searchByRecipient(
                        "+27838884567");

        assertTrue(
                result.contains(
                        "Ok, I am leaving without you."));
    }

    @Test
    public void testDeleteMessageByHash() {

        MessageManager manager = new MessageManager();

        Message msg =
                new Message(
                        "+27838884567",
                        "Delete Me",
                        1);

        manager.addStoredMessage(msg);

        String result =
                manager.deleteByHash(
                        msg.getMessageHash());

        assertEquals(
                "Message successfully deleted.",
                result);
    }

    @Test
    public void testDisplayReport() {

        MessageManager manager = new MessageManager();

        manager.addStoredMessage(
                new Message(
                        "+27838884567",
                        "Report Message",
                        1));

        String report =
                manager.displayReport();

        assertTrue(
                report.contains(
                        "Report Message"));
    }
}