package iteration;

public class PersonIteratorDesc implements Iterator<Person> {

    private PersonCollection personCollection;
    private int current;

    public PersonIteratorDesc(PersonCollection personCollection) {
        this.personCollection = personCollection;
        current = personCollection.size() - 1;
    }

    @Override
    public Person next() {
        return personCollection.get(current--);
    }

    @Override
    public boolean hasNext() {
        return this.current >= 0;
    }
}
