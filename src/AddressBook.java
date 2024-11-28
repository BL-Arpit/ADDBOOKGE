import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void addContact(Contact c1){
        adBook.add(c1);
        System.out.println("Contact is added");
    }
}
