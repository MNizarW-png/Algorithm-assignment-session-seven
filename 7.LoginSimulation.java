import java.util.ArrayList;
import java.util.Scanner;

public class LoginSimulation {
    static ArrayList<String> usernames = new ArrayList<String>();
    static ArrayList<String> passwords = new ArrayList<String>();

    public static void main(String[] args) {
        usernames.add("nizar");
        passwords.add("12345");

        usernames.add("zidane");
        passwords.add("abcde");

        usernames.add("regith");
        passwords.add("pass123");

        usernames.add("nabyl");
        passwords.add("qwerty");

        usernames.add("imam");
        passwords.add("letmein");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = input.nextLine();

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        boolean valid = false;
        for (int i = 0; i < usernames.size(); i++) {
            if (user.equals(usernames.get(i)) && pass.equals(passwords.get(i))) {
                valid = true;
                break;
            }
        }

        if (valid) {
            System.out.println("Username and password valid, you can login into the dashboard.");
        } else {
            System.out.println("Wrong username and password.");
        }

        input.close();
    }
}