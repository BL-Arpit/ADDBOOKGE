import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LnkedListDemo <T> {
    LinkedList<T> migrateList = new LinkedList<>();
    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(24);
        a1.add(36);
        a1.add(17);
        a1.add(17);
        a1.add(49);
        a1.add(54);
        a1.add(21);
        a1.add(88);
        a1.add(18);
        a1.add(7);
        a1.add(29);
        a1.add(27);
        a1.add(56);
        a1.add(55);
        a1.add(9);
        a1.add(30);
        a1.add(63);
        a1.add(116);
        a1.add(63);
        a1.add(69);
        a1.add(13);
        a1.add(74);
        a1.add(5);

        //sort the array but keep the insertion order?
        //either you create another array and display the sorted on or go each element and print it : - one will only print numbers not array, one will use double
        //I want to only 5 bignumber :
        //i want to find the odd number


        List<Integer> updatedList = a1.stream().filter(i -> i%2 == 0).map(i -> i+5 ).sorted().distinct().collect(Collectors.toList());
        System.out.println(updatedList);
        System.out.println(a1);





    }

//    public void migrate(AddressBook<T> a){
//
//        for (T c : a.adBook){
//            migrateList.add(c);
//        }
//    }

    public void printMigratedList(){
        migrateList.display();
    }


}

//Basic stream functionalities

//light workshop - > Everyone have addressbook -
