import java.util.ArrayList;

public abstract class User {
    private static ArrayList<User> allUsers = new ArrayList<>();
    private static ArrayList<String> allLogins = new ArrayList<>();
    private static ArrayList<String> allEmails = new ArrayList<>();

    private String login;
    private String password;
    private String name;
    private String email;
    private String status;
    private String type;

    // constructor
    public User(String login, String password, String name, String email, String status, String type) {
        if (allLogins.contains(login)) {
            System.out.println("This login is already taken.");
            return;
        }
        if (allEmails.contains(email)) {
            System.out.println("This email is already taken.");
            return;
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$")) {
            System.out.println("Please enter a valid email address");
            return;
        }
        if (!status.equals("active") && !status.equals("inactive")) {
            System.out.println("The status must be either 'active' or 'inactive'.");
            return;
        }
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.status = status;
        this.type = type;
        allUsers.add(this);
        allLogins.add(login);
        allEmails.add(email);
    }

    // getters, setters, and other methods
    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public static void welcomeUser(User user) {
        System.out.println("Welcome, " + user.name + "!");
    }

    public static void goodbyeUser(User user) {
        System.out.println("Goodbye, " + user.name + "!");
    }

    public static User login(String login, String password) {
        for (User user : allUsers) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }
}