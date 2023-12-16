public class Manager extends User {
    // constructor
    public Manager(String login, String password, String name, String email, String status) {
        super(login, password, name, email, status, "Manager");
    }

    // getters, setters, and other manager-specific methods
    public static Manager register(String login, String password, String name, String email, String status) {
        return new Manager(login, password, name, email, status);
    }
}