public class Address {
    String city = "Chennai";
    String state  ="TN";
    String pinCode = "60001";

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
