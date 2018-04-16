package iteration;

public class PersonIterator implements Iterator<Person> {

    private PersonCollection personCollection;
    private int current;

    public PersonIterator(PersonCollection personCollection) {
        this.personCollection = personCollection;
        current = 0;
    }

    @Override
    public Person next() {
        return personCollection.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < personCollection.size();
    }
}
