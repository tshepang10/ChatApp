package loginapp;

public class Login {

    private String username;
    private String password;
    private String cellPhone;
    private String firstName;

    // Username check
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password check
    public boolean checkPasswordComplexity(String password) {
        boolean length = password.length() >= 8;
        boolean capital = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");

        return length && capital && number && special;
    }

    // Cell phone check
    public boolean checkCellPhoneNumber(String cellPhone) {
        return cellPhone.matches("^\\+27\\d{9}$");
    }

    // Register user
    public String registerUser(String firstName, String username, String password, String cellPhone) {

        if (!checkUsername(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cellPhone)) {
            return "Cell number incorrectly formatted or does not contain international code.";
        }

        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;

        return "User successfully registered.";
    }

    // Login check
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Login message
    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome " + firstName + ", you are now logged in. You are granted access to use the app.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}