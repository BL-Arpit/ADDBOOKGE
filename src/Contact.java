import java.util.Scanner;

public class Contact {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int phone;
    int zip;


    public Contact(String firstName, String lastName, String city, String state, String email, int phone, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", zip=" + zip +
                '}';
    }


}
