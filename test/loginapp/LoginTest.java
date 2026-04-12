// Unit tests created using JUnit 4 to validate username, password,
// cell phone validation, registration, and login functionality.

package loginapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    Login login = new Login();

    // Username Tests
    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(login.checkUsername("kyl_1"));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        assertFalse(login.checkUsername("kyle!!!!!!!"));
    }

    // Password Tests
    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(login.checkPasswordComplexity("#Ch4rles"));
    }

    @Test
    public void testPasswordFailsComplexity() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    // Cell Phone Tests
    @Test
    public void testCellPhoneCorrectFormat() {
        assertTrue(login.checkCellPhoneNumber("+27821990897"));
    }

    @Test
    public void testCellPhoneIncorrectFormat() {
        assertFalse(login.checkCellPhoneNumber("0821990876"));
    }

    // Registration Test
    @Test
    public void testRegisterUserSuccess() {
        String result = login.registerUser("Kyle", "kyl_1", "#Ch4rles", "+27821990897");
        assertEquals("User successfully registered.", result);
    }

    // Login Tests
    @Test
    public void testLoginSuccess() {
        login.registerUser("Kyle", "kyl_1", "#Ch4rles", "+27821990897");
        assertTrue(login.login("kyl_1", "#Ch4rles"));
    }

    @Test
    public void testLoginFail() {
        login.registerUser("Kyle", "kyl_1", "#Ch4rles", "+27821990897");
        assertFalse(login.login("wrong", "wrong"));
    }
}