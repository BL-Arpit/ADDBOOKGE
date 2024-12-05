import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook<Contact> a1 = new AddressBook<>();
        a1.adBook.add(new Contact("Akshita","Kullarni","Hyd","Telengana","Abc",123,111));
        a1.adBook.add(new Contact("Angira","Tiwari","Mirzapur","UP","Abc",123,111));
        a1.adBook.add(new Contact("Akshaya","Nalam","Guntur","AP","Abc",123,111));
        a1.adBook.add(new Contact("riya","bisht","dehradun","uttrakhand","abc",124,11));
        a1.adBook.add(new Contact("Deepa","Pandey","Haldwani","Uttrakhand","abc",123,111));
        a1.adBook.add(new Contact("Shuchita","Gupta","Guna","MP","a", 345,890));
        a1.adBook.add(new Contact("Dhanalaxmi","Musku","Hyd","Telangana","AC",123,444));
        a1.adBook.add(new Contact("Lakshita","Tak","Jaipur","Rajasthan","abc",133,10));
        a1.adBook.add(new Contact("Priya","Chintagunta","Rajahmundry","AndhraPradesh","xyz",123,111));
        a1.adBook.add(new Contact("Aakriti","Tiwari","Jhansi","Uttar pradesh","abc",145,414));



        int i = 1;
        LnkedListDemo<BussinessContact> l1 = new LnkedListDemo<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display al contacts \n Enter 3 to migrate data to custom linked list \n Enter 4 for display migrated list");
            int input = sc.nextInt();
            switch (input){
                case 1 -> a1.addContact(createContact());
                case 2 ->  a1.display();
                case 3 -> a1.search();
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
    //Streams - Pipeline of data provided by the collection - its an one time use object



}
