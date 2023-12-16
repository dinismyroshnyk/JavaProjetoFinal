public class Customer extends User {
    private String NIF;
    private String address;
    private String phoneNumber;

    // constructor
    public Customer(String login, String password, String name, String email, String status, String NIF, String address, String phoneNumber) {
        super(login, password, name, email, status, "Customer");
        this.NIF = NIF;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // getters, setters, and other customer-specific methods
    public static Customer register(String login, String password, String name, String email, String status, String NIF, String address, String phoneNumber) {
        return new Customer(login, password, name, email, status, NIF, address, phoneNumber);
    }
}