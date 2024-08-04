package dio.example.design.pattern.project1.structure;

public class Client {
    public String name;
    public String zipCode;
    public String city;
    public String state;
    public String address;

    @Override
    public String toString() {
        return "Client{" +
            "name:" + name +
            ", zipCode:" + zipCode +
            ", city:" + city +
            ", state:" + state +
            ", address:" + address +
        "}";
    }
}
