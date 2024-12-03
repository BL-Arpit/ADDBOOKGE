import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook<BussinessContact> a1 = new AddressBook<>();
        int i = 1;
        LnkedListDemo<BussinessContact> l1 = new LnkedListDemo<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display al contacts \n Enter 3 to migrate data to custom linked list \n Enter 4 for display migrated list");
            int input = sc.nextInt();
            switch (input){
                case 1 -> a1.addContact(createBussinessContact());
                case 2 ->  a1.display();
                case 3 -> l1.migrate(a1);
                case 4 -> l1.printMigratedList();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();

        }while(i!=0);

        System.out.println("Thank you for using address book");
        sc.close();


    }
    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone");
        int phone = sc.nextInt();
        System.out.println("Enter name");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        return c1;
    }

    public static BussinessContact createBussinessContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name ");
        String cname = sc.next();
        System.out.println("Employee Name");
        String ename = sc.next();
        System.out.println("Employee mail");
        String bmail= sc.next();

        BussinessContact b1 = new BussinessContact(cname,ename,bmail);
        return b1;


    }



}
