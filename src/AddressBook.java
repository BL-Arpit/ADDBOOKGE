import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook <PlaceHolder>{
    List<PlaceHolder> adBook = new ArrayList<>();



    public void display(){
        System.out.println(adBook);
    }

    public void addContact(PlaceHolder c1){
        adBook.add((PlaceHolder) c1);
    }
}
