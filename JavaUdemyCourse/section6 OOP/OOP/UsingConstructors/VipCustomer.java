package UsingConstructors;

public class VipCustomer {
    private String name;
    private Double limit;
    private String email;

    public VipCustomer() {
        this("GenericMan", 100.0, "GenericMan@genricmail.com");

    }

    public VipCustomer(String name, Double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public VipCustomer(String name, String email) {
        this(name, 100.0, email);

    }

    public String getName() {
        return name;
    }

    public Double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}


