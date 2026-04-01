import java.util.Scanner;

// User-defined exception class
class Validation extends Exception {
    public Validation(String message) {
        super(message);
    }
}

public class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("Enter username:");
        username = sc.next();

        System.out.println("Enter password:");
        password = sc.next();

        try {
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                throw new Validation("Invalid username or password !!");
            }
        } catch (Validation e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
