public class SignupValidator {
    // true when username has at least 3 and at most 12 characters
    public static boolean validUser(String username) {
        return false; // replace this line
    }

    // true when email contains an @ that is not first,
    // and the first . comes after the @ (use indexOf)
    public static boolean validEmail(String email) {
        return false; // replace this line
    }

    // true when password has at least 8 characters and does not equal username (use equals)
    public static boolean validPassword(String password, String username) {
        return false; // replace this line
    }

    public static void main(String[] args) {
        String username = "maya";
        String email = "maya@school.org";
        String password = "bluebird7";
        // Print Accepted only if all three are true. Otherwise print Rejected.
        // Test one good signup and three bad ones. Record the results in a comment.
    }
}
