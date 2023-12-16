public class Pharmacist extends User {
    private String NIF;
    private String address;
    private String phoneNumber;

    // constructor
    public Pharmacist(String login, String password, String name, String email, String status, String NIF, String address, String phoneNumber) {
        super(login, password, name, email, status, "Pharmacist");
        this.NIF = NIF;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // getters, setters, and other pharmacist-specific methods
    public static Pharmacist register(String login, String password, String name, String email, String status, String NIF, String address, String phoneNumber) {
        return new Pharmacist(login, password, name, email, status, NIF, address, phoneNumber);
    }
}