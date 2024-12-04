import java.util.HashSet;
import java.util.Set;

public class Dummy {
    public static void main(String[] args) {
//        Contact c1 = new Contact("a","a","a","a","a",9,3);
//        Contact c2 = new Contact("a","a","a","a","a",9,3);
//
//        Set<Integer> list1 = new HashSet<>();
//        list1.add(10);
//        list1.add(10);
//        System.out.println(list1);


        //Here we can create object interface by using lamda -> you pass the parameter - > You pass the body ()->{} - these are called anonymous function -
        Printable p1 = (b)->{
            System.out.println("HEy");
            System.out.println("Somebody is good");
            System.out.println(b);
        };

        Dummy d = new Dummy();
        d.display(p1);




    }

    public void display(Printable p){
        p.print(10);
    }
}
//another object with reference to the new keyword - so when we store complex object in hash set it compares the hashcode and creates the hsing function of the hash code generated