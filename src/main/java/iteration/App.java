package iteration;

public class App {

    public static void main(String[] args) {
        PersonCollection personCollection = new PersonCollection();
        personCollection.init();
        Iterator<Person> iterator1 = new PersonIterator(personCollection);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        Iterator<Person> iterator2 = new PersonIteratorDesc(personCollection);
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
