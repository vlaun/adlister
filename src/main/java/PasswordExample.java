import org.mindrot.jbcrypt.BCrypt;

/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class PasswordExample {
    public static void main(String[] args) {
        int numberOfRounds = 12;
// Register
        String plainTextPassword = "mypassword";
        String hash = BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(numberOfRounds));
        System.out.println(plainTextPassword);
        System.out.println(hash);


        boolean passwordsDoMatch = BCrypt.checkpw(plainTextPassword, hash);
        System.out.println(passwordsDoMatch);
    }
}
