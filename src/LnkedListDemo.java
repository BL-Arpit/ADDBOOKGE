public class LnkedListDemo <T> {
    LinkedList<T> migrateList = new LinkedList<>();
//    public static void main(String[] args) {
//
//        LinkedList<Integer> a1 = new LinkedList<>();
//        a1.add(10);
//        a1.add(20);
//        a1.add(10);
//        a1.add(20);
//        a1.display();
//    }

    public void migrate(AddressBook<T> a){

        for (T c : a.adBook){
            migrateList.add(c);
        }
    }

    public void printMigratedList(){
        migrateList.display();
    }


}
